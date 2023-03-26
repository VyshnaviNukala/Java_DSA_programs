import java.util.*;
class Solution{
	
	public static void main(String []argh)
{
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
        String input=sc.next();
        //Complete the code
        Stack<Character> stack=new Stack<>();

        for(char c : input.toCharArray()){
            if(!stack.isEmpty()){
                switch(c){
                    case ')':
                        if( stack.peek() == '(' ){
                            stack.pop();

                        }
                        break;
                    case '}':
                        if( stack.peek() == '{' ){
                            stack.pop();

                        }
                        break;
                    case ']':
                        if( stack.peek() == '[' ){
                            stack.pop();

                        }
                        break;
                    default:
                       stack.push(c);



                }

            }else{
                stack.push(c);
            }
        }

        System.out.println(stack.isEmpty());



    }

}
}



