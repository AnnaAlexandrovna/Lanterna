
public class MathPars1 {

    public double calculate(String stringToCalc) {

        double valueOfString = 0;
        try{
            Result result = getOperationsAndNumbers(stringToCalc);
            if (!result.restOfString.isEmpty()) {
                System.out.println("Error: can't full parse");
                System.out.println("rest: " + result.restOfString);
            }
            valueOfString = result.accumulator;

        }catch (Exception e){
            System.out.println("input is not correct");
            //e.printStackTrace();
        }
        return valueOfString;
    }

    public Result getOperationsAndNumbers(String stringToCalculate) throws Exception{
        Result current = operationWithHighPriority(stringToCalculate);
        double accumulator = current.accumulator;

        while (current.restOfString.length() > 0 && (current.restOfString.charAt(0) == '+' || current.restOfString.charAt(0) == '-')) {

            char sign = current.restOfString.charAt(0);
            String next = current.restOfString.substring(1);

            //получаем следующее число, которое будем прибавлять
            current = getNumber(next);

            if (sign == '+') {
                accumulator += current.accumulator;
            } else {
                accumulator -= current.accumulator;
            }
            current.accumulator = accumulator;
        }
        return new Result(current.accumulator, current.restOfString);

    }

    public Result getNumber(String stringToCalculate) throws Exception{
        int i = 0;
        int dotCounter =0;
        boolean negative = false;
        //если идут несколько минусов подряд
        while (stringToCalculate.charAt(0) == '-') {
            negative = true;
            stringToCalculate = stringToCalculate.substring(1);
        }

        // разрешаем только цифры и точку
        while (i < stringToCalculate.length() && (Character.isDigit(stringToCalculate.charAt(i)) || stringToCalculate.charAt(i) == '.')) {
            // но также проверям, что в числе может быть только одна точка!
            if (stringToCalculate.charAt(i) == '.' && ++ dotCounter > 1) {
                throw new Exception("not valid number '" + stringToCalculate.substring(0, i + 1) + "'");
            }
            i++;
        }
        if( i == 0 ){ // что-либо похожее на число мы не нашли
            throw new Exception( "can't get valid number in '" + stringToCalculate + "'" );
        }

        // выделили первое число в строке, останое передали
        double doubleNumber= Double.parseDouble(stringToCalculate.substring(0, i));
        if( negative ) doubleNumber = -doubleNumber;
        String restPart = stringToCalculate.substring(i);

        return new Result(doubleNumber, restPart);

    }
    private Result operationWithHighPriority(String stringToSolve) throws Exception {
        Result current = workWithBracket(stringToSolve);

        Result right;
        for(double acc = current.accumulator; current.restOfString.length() != 0; current = new Result(acc, right.restOfString)) {
            char sign = current.restOfString.charAt(0);
            if (sign != '*' && sign != '/') {
                return current;
            }

            String next = current.restOfString.substring(1);
            right = workWithBracket(next);
            if (sign == '*') {
                acc *= right.accumulator;
            } else {
                acc /= right.accumulator;
            }
        }

        return current;
    }

    private Result workWithBracket(String stringToSolve) throws Exception {
        char zeroChar = stringToSolve.charAt(0);
        //если выражение без скобок
        if (zeroChar != '(') {
            return this.functionVariable(stringToSolve);
        }
        //если выражение со скобками, вычисление выражения в скобке
        else {
            //передаем выражение без скобки
            Result expressionInBracket = getOperationsAndNumbers(stringToSolve.substring(1));
            if (!expressionInBracket.restOfString.isEmpty() && expressionInBracket.restOfString.charAt(0) == ')') {
                expressionInBracket.restOfString = expressionInBracket.restOfString.substring(1);
            } else {
                System.out.println("Error: not close bracket");
            }

            return expressionInBracket;
        }
    }

    private Result functionVariable(String stringToSolve) throws Exception {
        String f = "";

        int i;
        for(i = 0; i < stringToSolve.length() && (Character.isLetter(stringToSolve.charAt(i)) || Character.isDigit(stringToSolve.charAt(i)) && i > 0); ++i) {
            f = f + stringToSolve.charAt(i);
        }

        if (!f.isEmpty()) {
            if (stringToSolve.length() > i && stringToSolve.charAt(i) == '(') {
                Result r = workWithBracket(stringToSolve.substring(f.length()));
                return processFunction(f, r);
            } else {
                System.out.println("Error: Try get unexists variable");
                return new Result(0, stringToSolve.substring(f.length()));
            }
        } else {
            return this.getNumber(stringToSolve);
        }
    }

    private Result processFunction(String func, Result r) {
        if (func.equals("sin")) {
            return new Result(Math.sin(Math.toRadians(r.accumulator)), r.restOfString);
        } else if (func.equals("cos")) {
            return new Result(Math.cos(Math.toRadians(r.accumulator)), r.restOfString);
        } else if (func.equals("tan")) {
            return new Result(Math.tan(Math.toRadians(r.accumulator)), r.restOfString);
        }else if (func.equals("sqrt")) {
            return new Result(Math.sqrt((r.accumulator)), r.restOfString);
        }else if (func.equals("ln")) {
            return new Result(Math.log((r.accumulator)), r.restOfString);
        }
        else {
            System.out.println("function '" + func + "' is not defined");
            return r;
        }
    }

}

