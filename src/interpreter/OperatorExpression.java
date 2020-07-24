package interpreter;

/**
 * 运算符号抽象解释器
 */
public abstract class OperatorExpression extends ArithmeticExpression{
    public ArithmeticExpression exp1,exp2;

    public OperatorExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
