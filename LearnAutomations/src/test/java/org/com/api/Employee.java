package org.com.api;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class Employee {
	public static void main(String[] args) throws JsonProcessingException {
		Pojo pojo = new Pojo();
		pojo.setFirstname("Manoj");
		pojo.setLastname("Kumar");
		pojo.setEmail("manojvk97@gmail.com");
		pojo.setSkills(Arrays.asList("Java","Selenium"));
		
		System.out.println(pojo.getFirstname());
		System.out.println(pojo.getLastname());
		System.out.println(pojo.getEmail());
		System.out.println(pojo.getSkills());
		
		ObjectMapper mapper = new ObjectMapper();
		String string = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
		System.out.println(string);
		
	}

}
