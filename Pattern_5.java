package College.Recursion.MultipleRecursion.Patterns;
// *****  
// ****
// ***
// **
// *

public class Pattern_5 {
    static void space(int noofspaces)
    {
        if(noofspaces==0)
        {
            return;
        }
        System.out.print(" ");
        space(noofspaces-1);
    }
    static void star(int noofstars)
    {
        if(noofstars==0)
        {
            return;
        }
        System.out.print("*");
        star(noofstars-1);

    }
    static void pattern(int n,int num)
    {
        if(n==0)
        {
            return;
        }
        star(n);
        space(num-n+1);
        System.out.println(" ");
        pattern(n-1, num);
    }

    public static void main(String[] args) {
        int n=5;
        pattern(n,n);
    }
    
}
