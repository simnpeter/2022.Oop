package oop.labor08.lab8_2;

public class Main {
    public static void main(String[] args) {
        /*StackInheritance stack = new StackInheritance(10);
        stack.push(12);
        stack.isEmpty();
        System.out.println(stack.top());
        stack.push(123);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
        stack.push(12);
       */
        StackAggregation stack1 = new StackAggregation( 5 );
        for( int i=0; i<10; ++i ){
// boxing: int --> Integer
            stack1.push( i );
        }
        System.out.print("StackAggregation : ");
        while( !stack1.isEmpty() ){
            System.out.print( stack1.top() + " ");
            stack1.pop();
        }
        System.out.println();
        StackInheritance stack2 = new StackInheritance( 5 );
        for( int i=0; i<10; ++i ){
            stack2.push( i );
        }
        stack2.remove( 1 );
        System.out.print("StackInheritance : ");
        while( !stack2.isEmpty() ){
            System.out.print( stack2.top() + " ");
            stack2.pop();
        }
        System.out.println();

    }
}
