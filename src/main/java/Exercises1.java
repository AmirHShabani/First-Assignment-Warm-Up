public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        int f = 1; 

        for (int i = n; i > 1; i--) { 
            f *= i;
        }

        return f;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        
        int a = 0, b = 1, c; 
        
        if (n==0) {
            return a; 
        }

        for (int i = n; i >= 2; i--){
            c = a + b; 
            a = b;
            b = c;
            
        }
        return b;
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        
        for (int i = 0; i <= rows; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");

            }
            System.out.println(); 

        }
        return null;
    }


    public static void main(String[] args) {
        // test your code here!
        Exercises1 exercises = new Exercises1();
        System.out.println(exercises.fibonacci(7)); 
        // Expected output: 8
    }

}