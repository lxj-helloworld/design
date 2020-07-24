package interpreter;

import java.util.Stack;

public class Calculator {
    //申明栈存储并操作所有相关的解释器
    private Stack<ArithmeticExpression> mExpStack = new Stack<>();
    public Calculator(String expression){
        ArithmeticExpression exp1,exp2;
        String[] elements = expression.split(" ");
        //循环遍历表达式元素数组
        for(int i=0;i<elements.length;i++){
            switch (elements[i].charAt(0)){
                case '+':
                    ///将栈中的解释器弹出作为运算符号左边的解释器
                    exp1 = mExpStack.pop();
                    //
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));

                    mExpStack.push(new AdditionExpression(exp1,exp2));
                    break;
                default:
                    mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    public int calculate(){
        return mExpStack.pop().interpret();
    }
}
