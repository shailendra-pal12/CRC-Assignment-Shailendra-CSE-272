import java.util.*;
class Balance{
 public static void main(String[] args){
  String s="()";
  Stack<Character> st=new Stack<>();
  for(char c:s.toCharArray()){
   if(c=='(') st.push(c);
   else if(c==')') st.pop();
  }
  if(st.empty())
   System.out.println("Balanced");
 }
}
