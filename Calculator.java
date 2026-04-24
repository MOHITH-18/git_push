
public class Calculator {
    public static int calculate(int a , int b , char op){
        switch(op){
            case '+': return a+b;
            case '-': return a-b;
            case '*': return a*b;
            case '/':
                if(b!=0) return a/b;
                else throw new ArithmeticException("Divide by zero");
            default :
                throw new IllegalArgumentException("Invalid operator");
        }
    }
    public static void main(String[] args){
        int num1 = 3;
        int num2  = 6;
        char operator = '*';
        int result = calculate(num1,num2,operator);
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    } 
}