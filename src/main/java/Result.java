class Result
{

    public double accumulator;//аккумулятор, для хранения текущего состояния процесса вычисления
    public String restOfString;//остаток строки

    public Result(double v, String r)
    {
        this.accumulator = v;
        this.restOfString = r;
    }
}