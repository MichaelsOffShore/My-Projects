import java.util.*;
public class Stack {

    // The array is being initialised
    int [] stack;

    // The "top" int is used to keep track of the top elements position
    int top = -1;
    /*
    This int initialises the size variable thats later
    assigned in the constructor method
    */
    int size = 0;


    // Constructor method
    public Stack(int size){

        // Setting the stacks size to the integer 
        // passed through the constructor method
        this.size = size;
      // Stack can store integers
      stack = new int[size];

    }

    // The "push" method adds an element to the stack
    public void push(int a){

        // Top is increased by 1 as there is now a new element at the top
        this.top++;
        // The new top element is the element just pushed to the stack
        this.stack[top] = a;
    }

    // The "pop" method removes the element at the top and adjusts the top
    // variable accordingly
    public void pop(){

        // We turn the top element to 0 and decrease top by 1
        stack[top] = 0;
        this.top--;

    }

    // The "peek" method acts as a getter method for the top most element
    // If the stack is empty then -1 is returned
    public int peek(){

        // If top is less than 0 then the stack must be empty
        if(this.top < 0){

            System.out.println("Stack is empty");
            return -1;

        }
        // Else we can return the element at the top of the stack -> stack[top]
        else{

            return stack[this.top];

        }


    }

// A method to print the stack
// NOTE, all empty places are represented with a 0
public void printStack(){


    System.out.println(Arrays.toString(stack));

    }

/*
The isEmpty method returns true or false
to tell us if the stack is empty or not
*/
public boolean isEmpty(){

        // If top is less than 0 then the stacks empty
        // Else return false because its not empty
        if(top < 0){
            return true;
        }
        return false;
}



} // End of Stack class
