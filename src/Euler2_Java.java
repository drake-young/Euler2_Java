public class Euler2_Java
{
    public static void main( String[ ] args )
    {
        // Setup
        Euler euler  =  new Euler( );
        long start   =  System.nanoTime( );

        // Output Results of Solution
        euler.printProblem2Context( );
        euler.printProblem2Solution( );

        // Compute  & Output Runtime
        long end         =  System.nanoTime( );
        float runtimeMS  =  ( end - start ) / ( float )1000000;  // Covert from nanoseconds to milliseconds
        System.out.printf( "Runtime:\t%.3f milliseconds%n" , runtimeMS );
    }
}
