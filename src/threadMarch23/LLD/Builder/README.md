
			   Builder DP is use to create complex objects step by step. We can create
			   different representations or types of an object using same construction code
		 
		    1. Let suppose we have class House which can have multiple fields like
		       buildFourWalls, buildFloor, window, roof, backyard, balcony, electricWiring.
		    
			   To create and initialize House obj we can a monster constructor where we pass all
			   these parameters.
			2. Problem with these monster constructor is that we need to remember the order in which 
			   we have passed the values. Second there might be some where we need to pass null values.
			   Like for simple house we just need fourWalls, floor, window and roof. backyard, balcony
			   will be null in this case.
			    
			3. Builder design pattern is used when we have to create an object with some validations
			   imposed on some of the attributes. So if we use constructor in this case then we will
			   end up having multiple if else inside the constructor which violates the SRP and OCP 
			   principles Suppose we want to create Student class object, so before creating stud obj,
		       we want to check if student id is not zero and psp is greater than 40 then only create
		         object.
		    4. We can create immutable object of a given class using this builder DP.
			 
			
			Builder Design pattern:-
		    1. Due to above problem we create a builder interface having all the steps
		       required to build house.
		    2. Concerete class - There will be Builder class which will implement the interface.
		    3. Director class - This class will control what are the steps required to build the house.
		    4. Use the method chaning concept where each each setter method return the current instance.
		          