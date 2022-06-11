package oop.labor11.labor11_4;

import javax.xml.xpath.XPathExpressionException;
import java.util.ArrayList;

public interface IExpression {

    public static double evaluate(String postfixExpression) throws ExpressionException{
        Stack exp = new Stack(postfixExpression.length()/2);
        String[] items = postfixExpression.split(" ");
        for (String o: items) {
            if(!isOperator(o)){
                try{
                    try{
                        exp.push(Double.parseDouble(o));
                    }
                    catch (StackException ex){
                        throw new ExpressionException("WRONG EXPRESSION");
                    }
                }catch (NumberFormatException ex){
                    throw new ExpressionException("WRONG OPERAND: " + o);
                }
            }
            else{
                try{
                    double veder1 = (double)exp.top();
                    exp.pop();
                    double veder2 = (double)exp.top();
                    exp.pop();
                    switch (o) {
                        case "*" -> exp.push(veder2 * veder1);
                        case "/" -> exp.push(veder2 / veder1);
                        case "-" -> exp.push(veder2 - veder1);
                        case "+" -> exp.push(veder2 + veder1);
                    }
                }
                catch (StackException ex){
                    throw new ExpressionException("WRONG POSTFIX EXPRESSION");
                }
            }
        }
        try {
            return (double)exp.top();
        }
        catch (StackException ex){
            throw new ExpressionException("WRONG POSTFIX EXPRESSION");
        }

    }
    public static boolean isOperator(String op){
        return switch (op) {
            case "*", "+", "/", "-" -> true;
            default -> false;
        };
    }
}
