class ifexample {
    
    public static void main(String[] args)
    {
        int a = 1, b = 2;

        if (a < b)
            System.out.println(b);
        else if (a > b)
            System.out.println(a);
        else
            System.out.println(a + "==" + b);
    }
}