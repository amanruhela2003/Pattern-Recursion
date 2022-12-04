package College.Recursion.MultipleRecursion.Patterns;
// A 
// B C 
// D E F 
// G H I J 

public class Pattern_11 {
    
    static int k=65;//ASCII VALUE OF "A"
    static void space(int noofspaces) {
        if (noofspaces == 0) {
            return;
        }
        System.out.print(" ");
        space(noofspaces - 1);
    }

    static void alphabets(int noofalphabets) {
        if (noofalphabets == 0) {
            return;
        }
        System.out.print((char)k+" ");
        k=k+1;
        
        alphabets(noofalphabets - 1);

    }

    static void pattern(int n, int num) {
        if (n == 0) {
            return;
        }
        alphabets(num-n);

        System.out.println(" ");
        pattern(n-1, num);
        
    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n, n);
    }
    
}
