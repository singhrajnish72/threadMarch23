Prototype - It's a design pattern use to create a copy of an object without making our code dependent on that class of which we create copy.

- Object whose copy is created is called sample.
  UseCases:
1. Sometimes we have to fetch object from DB and then have to use it any many places. Making multiple DB       call to fetch that same object is very costly operation. So in that scenario we can fetch object once from DB and create COPY of that object using PROTOTYPE DP.

2. Why to use this DP if we can create copy of object using clone method?
sol-> clone method creates shallow copy of an object but with this DP we can create deep copy an object.

3. Why can't we use copy constructor from client for creating an object?
sol->a> Sometimes object are passed via interface in method parameters so in that case we can't anything 
      about concrete classes. Let's say there is an interface "Shape" and two concrete classes Rectangle and       Circle. So here if in method parameter Shape is passed then we can't decide which class object we have to create. It can be either Rectangle or Circle. So we can directly call the copy constructor.
     
     b> If we use copy constructor then in then case we first need to check the instance of incoming object 
     present in refernce variable of Interface type. This will violate SRP and OCP principles. 
     
             if(obj isInstanceOf Rectangle){
                return new Rectangle(obj);
             }else if(obj isInstance of Circle){
                return new Circle(obj);
             }else{
             
             }
             
4. By using Prototype design pattern doesn't depend on concrete classes of the object we need to copy. We   just have to use interface.

5. Only thing we need to take care while writing Prototype DP is all the child class should override the copy method present in parent class.
               
      
       

		          