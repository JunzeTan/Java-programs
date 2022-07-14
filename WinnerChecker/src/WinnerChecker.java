import java.util.Scanner;
import java.util.Stack;

public class WinnerChecker {
    public static void main(String[] args) {
        //read the input
        Scanner scanner = new Scanner(System.in);
        String a;
        a = scanner.nextLine();
        int n = a.length();

        Character winner = tournament(a, n);
        //F here represent that if there is invalid input
        if (winner == 'F')
            System.out.println("Invalid Input");
        else
            System.out.println(winner);
    }
    private static Character win(Character character1, Character character2){
        //figure out the winner in the match
        if(character1=='R'){
            if(character2=='P')
                return 'P';
            return 'R';
        }
        else if (character1=='P'){
            if(character2=='S')
                return 'S';
            return 'P';
        }
        else if (character1=='S') {
            if (character2 == 'R')
                return 'R';
            return 'S';
        }
        return 'F';
    }
    private static String infixToPostfix(String a, int n){
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int open_count=0;
        int end_count=0;
        //loop for extract letters from the input
        for (int i = 0; i < n; i++){
            char c = a.charAt(i);
            if (Character.isLetter(c)){
                if (c!='R' && c!='P' && c!='S')
                    return "";
                result.append(c);
            }
            else if(c=='('){
                stack.push(c);
                open_count++;
            }
            else if(c==')'){
                if(stack.empty())
                    return "";
                while (!stack.isEmpty() && stack.peek() != '(')
                    result.append(stack.pop());
                stack.pop();
            }
            else if(c=='&'){
                end_count++;
                while (!stack.isEmpty() && stack.peek() != '(')
                    result.append(stack.pop());
                stack.push(c);
            }
            else{
                return "";
            }
        }
        if (open_count != end_count)
            return "";
        while (!stack.isEmpty()){
            if (stack.peek() == '(')
                return "";
            result.append(stack.pop());
        }
        return result.toString();
    }
    private static  Character tournament(String a, int n){
        String str = infixToPostfix(a, n);
        //in case there is no input it will return invalid input
        if (str.length() == 0)
            return 'F';
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if (c != '&')
                stack.push(c);
            else{
                Character valid1 = stack.pop();
                Character valid2 = stack.pop();
                stack.push(win(valid1, valid2));

            }
        }
        return stack.pop();
    }
}
