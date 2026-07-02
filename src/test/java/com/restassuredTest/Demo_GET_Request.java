package com.restassuredTest;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo_GET_Request {

    @Test
    public void getWeatherDetails() {

    	// Get Request
        given()

        .when()
            .get("https://jsonplaceholder.typicode.com/posts/1")  // This fake URL For learing and practise

        .then()
            .statusCode(200)
            .statusLine("HTTP/1.1 200 OK")
            .log().body()
            .body("userId", equalTo(1))
            .body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
            .header("Content-Type", "application/json; charset=utf-8");
   }
    
    @Test
    public void createPost() {
    	//POST Request
    
    	given()
    		.contentType("application/json")
    		.body("{\"title\":\"API\",\"body\":\"Testing\",\"userId\":1}")
    	
    	.when()
    		.post("https://jsonplaceholder.typicode.com/posts")
    	
    	.then()
    		.log().all()
    		.statusCode(201);
    }
    //PUT request(Next)
     @Test
     public void updatePost() {
    	 
    	 //We use existing data update
    	 
    	 given()
    	 	.contentType("application/json")
    	 	.body("{\"id\":1,\"title\":\"Updated API\",\"body\":\"Updated Testing \",\"userId\":1}")
    	 	
    	 .when()
    	 	.put("https://jsonplaceholder.typicode.com/posts/1")
    	 	
    	 .then()
    	 .log().all()
    	 .statusCode(200);
     }
     
     //Delete Request 
     @Test
     public void deletePost() {
    	 
    	 given()
    	 
    	 .when()
    	 	.delete("https://jsonplaceholder.typicode.com/posts/1")
    	 	
    	 .then()
    	 	.log().all()
    	 	.statusCode(200);
     }
}
    	
    	
    
