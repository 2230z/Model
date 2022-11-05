package JAVA;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str =  "!(&(&(f),&(!(t),&(f),|(f)),&(!(&(f)),&(t),|(f,f,t))))";
        System.out.println(parseBoolExpr(str));
    }


    public static boolean parseBoolExpr(String expression) {
        Stack<Character> operation = new Stack();
        Stack<Character> items = new Stack();
        int i=0;
        char c,op;
        while(i<expression.length()){
            c = expression.charAt(i);
            if(c=='!' || c=='|' || c=='&') operation.push(c);
            else if(c==')'){
                op = operation.pop();
                boolean res;
                char p;
                if(op == '&'){
                    res = true;
                    while((p = items.pop()) != '('){
//                        p = items.pop();
                        if(res) res = res && result(p);

                    }
                }else if(op == '|'){
                    res = false;
                    while((p = items.pop())!= '('){
//                        p = items.pop();
                        if(!res) res = res || result(p);

                    }
                }else{
                    p = items.pop();
                    res = result(p);
                    res = !res;
                    items.pop();
                }
//                items.pop();  // 出左括号
                System.out.println(res+"  ---");
                items.push(res?'t':'f');
            }else if(c==','){ }
            else items.push(c);
            i++;
        }
        return result(items.peek());

    }

    public static boolean result(char c){
        return c=='t';
    }
}
