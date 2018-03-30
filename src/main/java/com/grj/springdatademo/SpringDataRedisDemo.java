package com.grj.springdatademo;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;


/**
 * SpringData relevance Redis
 *
 */
public class SpringDataRedisDemo {
	public static void main(String[] args) throws BeansException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		RedisTemplate<String, String> template = applicationContext.getBean(RedisTemplate.class);
		template.opsForValue().set("d", "d");
//		String string = template.opsForValue().get("d");
		String object = template.opsForValue().get("d");
		System.out.println(object);
	}

}
