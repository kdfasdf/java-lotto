package calculator;

public class Calculation {
    Operator operator = Operator.getOperator();

    public int calculate(StringExpression expression) {
        String[] splitedExpression = expression.getSplitedExpression();

        int result = Integer.parseInt(splitedExpression[0]);
        for (int i = 1; i < splitedExpression.length - 1; i += 2) {
            int operand = Integer.parseInt(splitedExpression[i + 1]);
            result = operator.selection(splitedExpression[i]).applyAsInt(result, operand);
        }

        return result;
    }

}
