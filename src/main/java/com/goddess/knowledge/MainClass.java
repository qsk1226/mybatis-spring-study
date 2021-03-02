package com.goddess.knowledge;

import com.goddess.knowledge.service.HeroService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO
 *
 * @author qinshengke
 * @since 2021/2/3
 **/
public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentConfig.class);
		HeroService bean = applicationContext.getBean(HeroService.class);
		System.out.println(1);
	}

}
