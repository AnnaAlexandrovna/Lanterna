
public class MathPars2 {

    public String calculate(String stringToCalc) {

        int valueOfString = 0;
        String valueOfStringBin ="";
        try{
            Result2 result = getOperationsAndNumbers(stringToCalc);
            if (!result.restOfString.isEmpty()) {
                System.out.println("Error: can't full parse");
                System.out.println("rest: " + result.restOfString);
            }
            valueOfString = result.accumulator;
            valueOfStringBin = Integer.toBinaryString(valueOfString);

        }catch (Exception e){
            System.out.println("input is not correct");
            //e.printStackTrace();
        }
        return valueOfStringBin;
    }

    public Result2 getOperationsAndNumbers(String stringToCalculate) throws Exception{
        Result2 current = operationWithHighPriority(stringToCalculate);
        int accumulator = current.accumulator;

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
        return new Result2(current.accumulator, current.restOfString);

    }

    public Result2 getNumber(String stringToCalculate) throws Exception{
        int i = 0;
        boolean negative = false;
        //если идут несколько минусов подряд
        while (stringToCalculate.charAt(0) == '-') {
            negative = true;
            stringToCalculate = stringToCalculate.substring(1);
        }


        if( i == 0 ){ // что-либо похожее на число мы не нашли
            throw new Exception( "can't get valid number in '" + stringToCalculate + "'" );
        }

        // выделили первое число в строке, останое передали
        int intNumber= Integer.parseInt(stringToCalculate.substring(0, i));
        if( negative ) intNumber = -intNumber;
        String restPart = stringToCalculate.substring(i);

        return new Result2(intNumber, restPart);

    }
    private Result2 operationWithHighPriority(String stringToSolve) throws Exception {
        Result2 current = workWithBracket(stringToSolve);

        Result2 right;
        for(int acc = current.accumulator; current.restOfString.length() != 0; current = new Result2(acc, right.restOfString)) {
            String sign = current.restOfString.substring(0,2);
            if (sign != "and" && sign != "not" && sign!="oor"&& sign!="xor") {
                return current;
            }

            String next = current.restOfString.substring(1);
            right = workWithBracket(next);
            if (sign == "and") {
                acc = acc & right.accumulator;
            } else if (sign == "oor") {
                acc = acc | right.accumulator;
            } else if (sign == "xor") {
                acc = acc ^ right.accumulator;
            }
        }

        return current;
    }

    private Result2 workWithBracket(String stringToSolve) throws Exception {
        char zeroChar = stringToSolve.charAt(0);
        //если выражение без скобок
        if (zeroChar != '(') {
            return this.functionVariable(stringToSolve);
        }
        //если выражение со скобками, вычисление выражения в скобке
        else {
            //передаем выражение без скобки
            Result2 expressionInBracket = getOperationsAndNumbers(stringToSolve.substring(1));
            if (!expressionInBracket.restOfString.isEmpty() && expressionInBracket.restOfString.charAt(0) == ')') {
                expressionInBracket.restOfString = expressionInBracket.restOfString.substring(1);
            } else {
                System.out.println("Error: not close bracket");
            }

            return expressionInBracket;
        }
    }

    private Result2 functionVariable(String stringToSolve) throws Exception {
        String f = "";

        int i;
        for(i = 0; i < stringToSolve.length() && (Character.isLetter(stringToSolve.charAt(i)) || Character.isDigit(stringToSolve.charAt(i)) && i > 0); ++i) {
            f = f + stringToSolve.charAt(i);
        }

        if (!f.isEmpty()) {

                System.out.println("Error: Try get unexists variable");
                return new Result2(0, stringToSolve.substring(f.length()));

        } else {
            return this.getNumber(stringToSolve);
        }
    }

}

