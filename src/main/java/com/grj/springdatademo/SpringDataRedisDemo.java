package com.grj.springdatademo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;


/**
 * SpringData ÕûºÏ Redis
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
