# Runtime polymorphism

A very simple example that demonstrate the power of Runtime Polymorphism / Dynamic Method Dispatch.

We have created a very simply Animal Class and have 2 different class, ie: (CanHunt class) one which can hunt & another (CantHunt class) which can not hunt. 
Both class have 1 same single simple function which is hunt::void which simply prints whether it can hunt or not.

Suppose we create an Animal tiger and we want it to have the capability of CanHunt::class, for that we will have to extend our Animal class to CanHunt::class 
but what if we want to restrict our little tiger from hunting in the wild until he/she is 2 year old and allow to go hunting in the jungle after 2 year , ie: changing behaviour at Runtime..
( using single Animal class)......... Have you thought about it ?

Here comes the beauty of Dynamic Method Dispatch/Runtime Polymorphism. ( Please don't get scared by those words. I have only used it so that you become aware of these words )

What we do here is... we create a Hunter Interface and let the two class ( CanHunt & CantHunt ) implement Hunter interface which has a single method void::hunt

And we create a function within Animal class which checks for the age of animal and accordingly returns a new Instance of CanHunt/CantHunt class. 
If the animal is less than 2 year it returns CantHunt instance or else CanHunt.

This way when the animal grows old ( above 2 year ) it automatically gets Hunting capability else he's not allowed to go hunting..

What we did here is changed the behaviour at Runtime.


While compiling, the compiler has no idea about which method will be called. What it knows is that it has a reference of the Hunter Interface. And during runtime it resolves which method is to be called.

Unlike Method Overloading ( Static Polymorphism ) where the compiler knows at compile time which method will be called.
For example: we have one method  sum(int num1, int num2) & we overload it like.. sum(float num1, float num2) so that we have two different functions to calculate sum of integers & sum of floating number.

So when we call sum(2, 4) anywhere in our code, the compiler knows during compile time that it has to call the integer method and not the float method. 