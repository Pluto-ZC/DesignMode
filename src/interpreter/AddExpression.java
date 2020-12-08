package interpreter;

import java.util.HashMap;

/**
 * 假发加法解释器
 * @author Administrator
 *
 */
public class AddExpression extends SymbolExpression  {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	//处理相加
	//var 仍然是 {a=10,b=20}..

	public int interpreter(HashMap<String, Integer> var) {
		//super.left.interpreter(var) 返回 left 表达式对应的值 a = 10
		//super.right.interpreter(var): 返回right 表达式对应的值 b = 20
		return super.left.interpreter(var) + super.right.interpreter(var);
	}
}
