package com.tutorialspoint;

public class HelloWorld {
   private String message,message2,message3;

   public String getMessage3() {
	return message3;
}

public void setMessage3(String message3) {
	this.message3 = message3;
}

public void setMessage(String message){
      this.message  = message;
   }

   public String getMessage2() {
	return message2;
}

public void setMessage2(String message2) {
	this.message2 = message2;
}

public void getMessage(){
      System.out.println("Your Message : " + message + "/" + message2);
   }
   
   public void init(){
	      System.out.println("Bean is going through init.");
	   }
   public void destroy(){
	      System.out.println("Bean will destroy now.");
	   }
}