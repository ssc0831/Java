package com.test;

class Person{
    String name;
    int age;
    String major;
   
    public Person(String name, int age){
      this.name=name;
      this.age=age;
    }

    public void show(){
      System.out.println(name+" "+age);
      System.out.println(major);
    }
}

class Student extends Person{

   public Student(String name, int age, String major) {
		super(name, age);
		this.major=major;
		
	} 
   @Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
	}
}



public class Test {
     public static void main(String[] args) {
	    Person p=new Student("홍길동", 20, "컴퓨터공학");
            p.show();
      }
}


























//public class Test {
//	   public static void main(String[] args) {
//		 String city = "서울";
//		 String country = "";
//		 switch(city) {
//		 case "서울" :
//		 case "부산" : country = "한국";
//		 case "북경" : country = "중국"; 
//	           case "동경" : country = "일본";    break;
//		  default : country = "대상없음";
//	         }
//	               System.out.println(country);    
//	    }
//	}