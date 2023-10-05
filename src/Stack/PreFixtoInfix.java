package Stack;

import java.util.Stack;

public class PreFixtoInfix {
    public static String preInfix(String preExp){
        Stack<String> st=new Stack();
        for(int i=preExp.length()-1;i>=0;i--){
            Character ch=preExp.charAt(i);

            if(isOperator(ch)){
                   String firstVal=st.pop();
                   String secondVAl=st.pop();
                   st.push("("+firstVal+ch+secondVAl+")");
            }
            else{
//                String ss=ch.toString();
//                st.push(ss);
                st.push(ch+"");
            }

        }
        return st.peek();
    }

    private static boolean isOperator(Character ch) {
        return ch=='+' || ch=='*' || ch=='-' || ch=='/' || ch=='*' || ch=='%';
    }
}
