# Runtime polymorphism

A very simple example that demonstrate the power of Runtime Polymorphism / Dynamic Method Dispatch.

We have created a very simply Animal Class and have 2 different class, ie: (canHunt class) one which can hunt & another (CantHunt class) which can not. 
Both class have 1 same single simple function which is hunt::void which simply prints whether it can hunt or can not.

Suppose we create an Animal tiger and we want it to have the capability of CanHunt::class, for that we will have to extend our Animal class to CanHunt::class 
but what if we want to restrict our little tiger from hunting in the wild until he/she is 2 year old and allow to go hunting in the jungle after 2 year 
( using single Animal class)......... Have you thought about it ?

Here comes the beauty of Dynamic/Runtime Polymorphism.

What we do here is... we create a Hunter Interface and let the two class ( CanHunt & CantHunt ) implement Hunter interface which has a single method void::hunt

And we create a function within Animal class which checks for the age of animal and accordingly returns a new Instance of CanHunt/CantHunt class. 
If the animal is less than 2 year it returns cantHunt instance or else canHunt.


This way when the animal grows old ( above 2 year ) it automatically gets Hunting capability else he's not allowed to go hunting..
