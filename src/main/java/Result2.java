class Result2
{

    public int accumulator;//аккумулятор, для хранения текущего состояния процесса вычисления
    public String restOfString;//остаток строки

    public Result2(int v, String r)
    {
        this.accumulator = v;
        this.restOfString = r;
    }
}