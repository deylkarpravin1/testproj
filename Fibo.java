package t;

public class Fibo {
    public static void main(String[] args) {
        int n  = 10;

        int a = 0;
        int b = 1;
        int sum = 0;

        int count  = 0;

        while(count <= n)
        {
            if(count ==0)
            {
                System.out.println(a);
                System.out.println(b);
                count++;
            }
            else {
                sum = a + b;
                System.out.println(sum);
                a=b;
                b=sum;
                count++;
            }
        }
    }



}
