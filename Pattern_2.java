package College.Recursion.MultipleRecursion.Patterns;
    //     *
    //    **
    //   ***
    //  ****
    // *****


public class Pattern_2 {

    static void line(int numberoflines, int totallines)
    {

        if(numberoflines==0)
        {
            return;
        }


        line(numberoflines-1,totallines); //cycle
        space(totallines-numberoflines);
        star(numberoflines);
        System.out.println();


    }
    static void star( int numberofstar)
    {
        if(numberofstar==0)
        {
            return;
        }
        System.out.print("*");
        star(numberofstar-1);
    } 
    static void space( int numberofspace)
    {
        if(numberofspace==0)
        {
            return;
        }
        System.out.print(" ");
        space(numberofspace-1);
    } 


    static void pattern(int numberoflines){

        line(numberoflines,numberoflines);
    }
    public static void main(String[] args) {
        pattern(5);
        
    }

    
}
