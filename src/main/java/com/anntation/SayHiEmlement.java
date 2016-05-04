package com.anntation;

import org.springframework.stereotype.Component;

/**
 * 要使用SayHiAnnotation的元素所在类 由于我们定义了只有方法才能使用我们的注解，我们就使用多个方法来进行测试
 * 
 * @author Johness
 * 
 */
@Component
public class SayHiEmlement {
	public String name1;
	public String sex1;

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getSex1() {
		return sex1;
	}

	public void setSex1(String sex1) {
		this.sex1 = sex1;
	}

	// 普通的方法
	public void SayHiDefault(String name) {
		System.out.println("Hi, " + name);
	}

	// 使用注解并传入参数的方法
	@SayHiAnnotation(paramValue = "Jack")
	public void SayHiAnnotation(String name) {
		System.out.println("Hi, " + name);
	}

	// 使用注解并使用默认参数的方法
	@SayHiAnnotation
	public void SayHiAnnotationDefault(String name) {
		System.out.println("Hi, " + name);
	}

}