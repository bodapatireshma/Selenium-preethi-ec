package com.pojo.com;

public class Classic {

		public static void main(String[] args) {
			Basic b = new Basic();
			
			b.setAge(25);
			int age = b.getAge();
			System.out.println(age);
			
			b.setName("TEST");
			String name = b.getName();
			System.out.println(name);
		}
}