# Java Arrays

An array is a group of like-typed variables that are referred to by a common name.
Array can contains primitives data types as well as objects of a class depending on the definition of array. In case of primitives data types, the actual values are stored in contiguous memory locations. 


int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 




# For Each Loop
The Java for-each loop traverses the array or collection until the last element. For each element, it stores the element in the variable and executes the body of the for-each loop.


for (type var : array) 
{ 
    statements using var;
}


# MultiThreading

Multithreading in Java is a process of executing multiple threads simultaneously.
A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.
However, we use multithreading than multiprocessing because threads use a shared memory area. They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process. 
