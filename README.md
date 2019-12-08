# Java Inheritance (Subclass and Superclass)

In Java, it is possible to inherit attributes and methods from one class to another. We group the "inheritance concept" in two categories:

- **subclass** (child) - the class that inherits from another class
- **superclass** (parent) - the class being inherited from.

To inherit from a class, use the *extends* keyword.

In the example below, the *Car* class (subclass) inherits from the attributes and methods of the *Vehicle* class (superclass):

> ## Example
> ```
>class Vehicle {
>   protected String brand = "Ford"; // Vehicle attribute
>     public void honk(){
>       System.out.println("Tuut, tuut!"); 
>     }
>}
>
>class Car extends Vehicle {
>   private String modelName = "Mustang"; // Car attribute
>   public static void main(String[] args){
>     // create a MyCar object
>     Car myCar = new Car();
>
>     // Call the honk() method (from the Vehicle class) on the myCar object
>     myCar.honk();
>     
>     // Display the value of the brand attribute (frmo the Vehicle class) and value of the modelName from the car class
>     System.out.println(myCar.brand + " " + myCar.modelName);
>   }
>     
>}
> ```


> Div you notice the *protected* modifier in Vehicle?
>
>We set the **brand** attribute in **Vehicle** to a *protected* [*access modifier*](https://www.w3schools.com/java/java_modifiers.asp). If it was set to *private*, the Car class would not be able to access it.
>
> ### Why and When to use "Ineritance"?
>\- It is usefull for code reusability: reuse attributes and methods of an existing class when you create a new class.
>
>**Tip:** Also take a look at the next chapter, [Polymorphism](https://www.w3schools.com/java/java_polymorphism.asp), which uses inherited methods to perform different tasks.
>

## The final keyword
If you don't want other classes to inherit from a class, use the ***final*** keyword:

> If you try to access a ***final*** class, Java will generate and error:
>> `final class Vehicle {`
>>  `...`
>>
>> `}`
>>
>> `class Car extends Vehicle {`
>>
>> `...`
>>
>> `}`
>>
> The output will be something like this:
> ```
> Car.java:8: error: cannot inherit from final Vehicle
> class Car extends Vehicle {
>                   ^
>1 error)
> ```