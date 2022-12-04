package College.Recursion.MultipleRecursion.Patterns;

// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321


public class Pattern_14 {
    static int k=1;
static int m=1;
    static void space(int noofspaces)
    {
        if(noofspaces==0)
        {
            return;
        }
        System.out.print("_");
        space(noofspaces-1);
    }
    static void digit(int noofdigits) {
        if (noofdigits == 0) {
            return;
        }
        System.out.print(k);
        k=k+1;
        
        digit(noofdigits - 1);
        k=1;

    }
    static void digit2(int noofdigits2) {
        m=noofdigits2;
        if (noofdigits2 == 0) {
            return;
        }
        System.out.print(m);
        m=m-1;
        
        digit2(noofdigits2 - 1);

    }
    static void pattern(int n,int num)
    {
        if(n==0)
        {
            return;
        }
        digit(num-n+1);
        space(2*n-2);
        digit2(num-n+1);
        System.out.println(" ");
        pattern(n-1, num);

    }

    public static void main(String[] args) {
        int n=10;
        pattern(n,n);
    }  
   
}
