import java.util.*;
public class Solution {

    public static void sortStack(Stack<Integer> stack) {
        if(stack.isEmpty()) return;

        int s=stack.pop();
        sortStack(stack);
        addElementToSortedStack(stack,s);
        
    }
    public static void addElementToSortedStack(Stack<Integer> stack,int s) {
        if(stack.isEmpty() || stack.peek()<=s) {
            stack.push(s);
            return;
        }
        else{
            int top=stack.pop();
            addElementToSortedStack(stack,s);
            stack.push(top);
            return;
        }
    }

}
