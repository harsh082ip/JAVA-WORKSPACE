
// When a func() calls itself, it's known as Recursion
/*
 How a Function call works?
 when any function is called, it will remain in stack memory
 when that particular function finishes executing it is then removed from that stack, and 
 the flow of program is restored to where the function was called
 */
/*
 Conditins for Recursion--
 It must have a base condition so that it may stop the flow of program, same as in loops
 Any Iterative Cond. can be converted into recursive and wise versa.

 What if there was no Base Cond.
 If there will be no base cond. func() will kep calling itself and will keep getting 
 filled in the stack memory, after some time the memory of the computer will get exceded,
 and will give an error called StackOverflow error.

 Why Recursion?
 Its helps in solving bigger/complex problems in a simpler way
 breaking down larger problem statemnet into smaller
 */
public class recursion {
    public static void main(String[] args) {
        print(1);
    }
static void print(int n){
    // Base Cond.
    if(n == 51)
    {
        return;
    }
    System.out.println(n);
    // Recursive Call
    print(n+1);
}
}