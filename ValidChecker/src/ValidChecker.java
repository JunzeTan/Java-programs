import java.util.*;
public class ValidChecker{
    public static void main(String[] args){
        // read the input
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        // the result that will be printed out after check
        boolean valid = check(string);
        if (valid){
            System.out.println("VALID");
        }
        else{
            System.out.println("INVALID");
        }
    }
    public static boolean check (String string){
        // check if it is one of R, S, or P when there is only one character.
        if (string.length()==1 && (string.charAt(0)=='R' || string.charAt(0)=='S' || string.charAt(0)=='P')){
            return true;
        }

        // check the valid character
        for(char character:string.toCharArray()){
            if(character!='R' && character!='S' && character!='P' && character!='&' && character!='(' && character!=')'){
                return false;
            }
        }
        Stack<Character> stk = new Stack<>();
        char[] ch = string.toCharArray();
        //case that the first character is ')'
        if (ch[0] == ')')
            return false;

        //the case ')(' is invalid
        for(int i=0; i<ch.length-1; i++){
            if(ch[i]==')' && ch[i+1]=='('){
                return false;
            }

        }
        char unknown = 'U';
        //extract the character after the brackets
        for (char character:ch){
            if (character == ')'){
                char character1 = stk.pop();
                char character2 = stk.pop();
                char character3 = stk.pop();
                char character4 = stk.pop();
                if (character2 == '&' && character4 == '('){
                    stk.push(unknown);
                }
                else{
                    return false;
                }
            }
            else{
                stk.push(character);
            }
        }
        stk.pop();
        return stk.isEmpty();
    }
}
