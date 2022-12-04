package College.Recursion.MultipleRecursion.Patterns;
// *
// **
// ***
// ****
// *****


public class Pattern_1 {

    static void line(int numberoflines)
    {

        if(numberoflines==0)
        {
            return;
        }


        line(numberoflines-1); //cycle
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
    
        

    static void patternOne(int numberoflines){

        line(numberoflines);
    }

        public static void main(String[] args) {
            patternOne(5);
            
        }

    }

    

