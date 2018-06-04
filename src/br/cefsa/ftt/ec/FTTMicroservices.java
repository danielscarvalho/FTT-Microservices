package br.cefsa.ftt.ec;

/*
 * Microserviços com SparkJava
 * 
 * http://sparkjava.com/
 * http://sparkjava.com/tutorials/
 * 
 * Gson:
 * 
 * https://github.com/google/gson/blob/master/UserGuide.md
 * 
 */

import static spark.Spark.*;
import com.google.gson.Gson; 

public class FTTMicroservices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Maria",10);

		 get("/hello", (req, res) -> "Hello, world");
         
	     get("/hello/:name", (req, res) -> {
	        return "Hello, "+ req.params(":name");
	     });

	     get("/add/:a/:b", (req, res) -> {
		        return Integer.valueOf(req.params(":a")) +
		        	   Integer.valueOf(req.params(":b"));
		 });
	     
	     get("/student", (req, res) -> {
	    	    Gson gson = new Gson();
		        return  gson.toJson(s1);
		 });
	     
	}

}
