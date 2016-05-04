import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SimpleHttpServer implements Runnable{
	 ServerSocket serverSocket;//服务器Socket
	
	    public static int PORT = 7890;//标准HTTP端口
	  
	    public String encoding = "GBK";
	  
	    public SimpleHttpServer() {
	        try {
	          serverSocket = new ServerSocket(PORT);
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.exit(1);
	        }
	        new Thread(this).start();
	        System.out.println("HTTP服务器正在运行,端口:" + PORT);
	    }
	  
	    public void run() {
	        while (true) {
	            try {
	                Socket client = serverSocket.accept();//客户机(这里是 IE 等浏览器)已经连接到当前服务器
	                if (client != null) {
	                	System.out.println("连接到服务器的用户:" + client);
	                    try {
	                        // 第一阶段: 打开输入流  
	                        InputStream is = client.getInputStream();
	  
	                        System.out.println("客户端发送的请求信息: >>>>>>>>>>>>>>>>>>>>>>>>>");
	                        // 读取第一行, 请求地址
	                        String line = readLine(is, 0);
	                        //打印请求行  
	                        //System.out.print(line);
	                        String method = new StringTokenizer(line).nextElement().toString();// 获取请求方法, GET 或者 POST
	                        int contentLength = 0;//如果为POST方法，则会有消息体长度
	  
	                        // 读取所有浏览器发送过来的请求参数头部信息
	                        do {
	                            line = readLine(is, 0);
	                            //如果有Content-Length消息头时取出 
	                            if (line.startsWith("Content-Length")) {
	                                contentLength = Integer.parseInt(line.split(":")[1].trim());
	                            }
	                            //打印请求部信息 
	                            System.out.print(line);
	                            //如果遇到了一个单独的回车换行，则表示请求头结束 
	                        } while (!line.equals("\r\n")); 
	                        //如果是POST请求，则有请求体 
	                        if ("POST".equalsIgnoreCase(method)) {
	                            //注，这里只是简单的处理表单提交的参数，而对于上传文件这里是不能这样处理的，
	                            //因为上传的文件时消息体不只是一行，会有多行消息体 
	                            System.out.print(readLine(is, contentLength));
	                            System.out.println();
	                        }
	  
	                        System.out.println("客户端发送的请求信息结束 <<<<<<<<<<<<<<<<<<<<<<<<<<");
//	                        System.out.println("用户请求的资源是:" + resource);
	                        System.out.println("请求的类型是: " + method);
	                        System.out.println();
	                        // 用 writer 对客户端 socket 输出一段 HTML 代码 
	                        PrintWriter out = new PrintWriter(client.getOutputStream(),true);
	                        out.println("HTTP/1.0 200 OK");//返回应答消息,并结束应答 
	                        out.println("Content-Type:text/html;charset=" + encoding);
	                        out.println();// 根据 HTTP 协议, 空行将结束头信息 
	                        out.println("接收成功");
	                        out.close();
	  
	                        closeSocket(client);
	                    } catch (Exception e) {
	                        System.out.println("HTTP服务器错误:" + e.getLocalizedMessage());
	                    }
	                }
	                //System.out.println(client+"连接到HTTP服务器");//如果加入这一句,服务器响应速度会很慢  
	            } catch (Exception e) {
	                System.out.println("HTTP服务器错误:" + e.getLocalizedMessage());
	            }
	        }
	    }
	  
	    /* 
	     * 这里我们自己模拟读取一行，因为如果使用API中的BufferedReader时，它是读取到一个回车换行后 
	     * 才返回，否则如果没有读取，则一直阻塞，这就导致如果为POST请求时，表单中的元素会以消息体传送， 
	     * 这时，消息体最末按标准是没有回车换行的，如果此时还使用BufferedReader来读时，则POST提交 
	     * 时会阻塞。如果是POST提交时我们按照消息体的长度Content-Length来截取消息体，这样就不会阻塞 
	     */
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		private String readLine(InputStream is, int contentLe) throws IOException {
	        ArrayList lineByteList = new ArrayList();
	        byte readByte;
	        int total = 0;
	        if (contentLe != 0) {
	            do {
	                readByte = (byte) is.read();
	                lineByteList.add(Byte.valueOf(readByte));
	                total++;
	            } while (total < contentLe);//消息体读还未读完 
	        } else {
	            do {
	                readByte = (byte) is.read();
	                lineByteList.add(Byte.valueOf(readByte));
	            } while (readByte != 10);
	        }
	  
	        byte[] tmpByteArr = new byte[lineByteList.size()];
	        for (int i = 0; i < lineByteList.size(); i++) {
	            tmpByteArr[i] = ((Byte) lineByteList.get(i)).byteValue();
	        }
	        lineByteList.clear();
	  
	        String tmpStr = new String(tmpByteArr, encoding); 
	        if (tmpStr.startsWith("Referer")) {//如果有Referer头时，使用UTF-8编码 
	            tmpStr = new String(tmpByteArr, "UTF-8");
	        }
	        return tmpStr;
	    }
	  
	    /**
	    * 关闭客户端 socket 并打印一条调试信息.
	    * @param socket 客户端 socket.
	    */  
	    void closeSocket(Socket socket) {
	        try {
	            socket.close();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	        System.out.println(socket + "离开了HTTP服务器");
	    }
	  
	  
	    public static void main(String[] args) {
	        PORT = 7890;
	        new SimpleHttpServer();
	    }
}

