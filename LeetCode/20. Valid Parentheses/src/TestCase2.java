import java.util.HashMap;
import java.util.Stack;

public class TestCase2 {// using a Stack approach


    private HashMap<Character, Character> map;// the closing brackets will become keys and the opening brackets will become values

    public TestCase2(){
        this.map = new HashMap<Character, Character>();
        this.map.put(')', '(');
        this.map.put('}', '{');
        this.map.put(']', '[');
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(this.map.containsKey(c)){// if the map contains the key, if its a value(opening bracket) then add it to the stack
                char topElement = stack.empty() ? '#' : stack.pop();// if the stack is empty put a #

                if(topElement != this.map.get(c)){// if the opening bracket matches the value at the particular c key, if not return false
                    return false;
                }
            }else{
                stack.push(c);// the stack will never hold closing brackets
            }
        }
        return stack.isEmpty();// if the stack is empty it means the string is valid
    }

    public static void main(String[] args){
        TestCase2 t2 = new TestCase2();
        String s = "{[[]{}]}()()";
        System.out.println(t2.isValid(s));
    }
}
