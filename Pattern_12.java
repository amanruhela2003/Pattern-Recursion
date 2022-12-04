package College.Recursion.MultipleRecursion.Patterns;
// 10101 
// 10101
// 10101
// 10101 
// 10101

public class Pattern_12 {
    static int k=1;
    static void space(int noofspaces) {
        if (noofspaces == 0) {
            return;
        }
        System.out.print(" ");
        space(noofspaces - 1);
    }

    static void digit(int noofdigits) {
        if (noofdigits == 0) {
            return;
        }
        if(k%2!=0)
        {
        System.out.print("1");
        }
        else
        {
        System.out.print("0");
        }

        k=k+1;
        
        digit(noofdigits - 1);
        k=1;

    }

    static void pattern(int n, int num) {
        if (n == 0) {
            return;
        }
        digit(num);

        System.out.println(" ");
        pattern(n-1, num);
        
    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n, n);
    }
    
}
