// ===========================================================
// PROBLEM 1 -- Multiples of 3 and 5
// ===========================================================
//
// If we list all the natural numbers below 10 that are
// multiples of 3 or 5, we get 3, 5, 6, and 9. The sum of
// these multiples is 23.
//
// Find the sum of all multiples of 3 or 5 below 1000
//
// ===========================================================

public class Euler
{
    // === PROBLEM 1 ATTRIBUTES === //
    private int prob1Multiple1  =  3;      // Multiples of *3* and 5
    private int prob1Multiple2  =  5;      // Multiples of 3 and *5*
    private int prob1Maximum    =  1000;   // Analyzing values under 1000
    private int prob1Solution   =  0;      // Will Hold the solution

    // === PROBLEM 2 ATTRIBUTES === //
    private int prob2Solution  =  0;        // Will hold the solution
    private int prob2Fib1      =  1;        // Fib3 = Fib2 + Fib1
    private int prob2Fib2      =  1;        // Fib3 = Fib2 + Fib1
    private int prob2Fib3      =  1;        // Fib3 = Fib2 + Fib1
    private int prob2Maximum   =  4000000;  // Maximum value in problem range

    // === CONSTRUCTOR === //
    public Euler( ){ /* Empty Constructor */ }

    // === PROBLEM 1 -- MULTIPLES OF 3 AND 5 === //

    // **********************************************************
    // PUBLIC METHOD: printProblem2Context
    // **********************************************************
    //
    // INPUT:  void
    // OUTPUT: void
    // TASK:   Display the title of the problem on a single line
    //
    // **********************************************************
    public void printProblem2Context( )
    {
        System.out.printf("Project Euler Problem 2 -- Even Fibonacci Numbers%n");
    }

    // **********************************************************
    // PUBLIC METHOD: printProblem2Solution
    // **********************************************************
    //
    // INPUT:  void
    // OUTPUT: void
    // TASK:
    //      -   Calculate the Solution (if none exists already)
    //      -   Print the solution to the console with formatting
    //
    // **********************************************************
    public void printProblem2Solution( )
    {
        if ( prob2Solution == 0 )
        {
            this.problem2( );
        }
        System.out.printf("Solution:\t%d%n", prob2Solution);
    }

    // **********************************************************
    // PRIVATE METHOD: problem2
    // **********************************************************
    //
    // INPUT:  void
    // OUTPUT: void
    // TASK:
    //      -   Compute the results of project Euler Problem 1
    //      -   Store the value of the results in the private
    //          attribute problem1Solution
    //
    // **********************************************************
    private void problem2(  )
    {
        // === Prepare Variables === //
        this.prob2Fib3      =  prob2Fib1 + prob2Fib2;
        this.prob2Solution  =  0;

        // === Computation Loop === //
        while ( prob2Fib3 < prob2Maximum )
        {
            if ( prob2Fib3 % 2 == 0 )
            {
                this.prob2Solution  +=  prob2Fib3;
            }
            this.prob2Fib1  =  this.prob2Fib2;
            this.prob2Fib2  =  this.prob2Fib3;
            this.prob2Fib3  =  this.prob2Fib1 + this.prob2Fib2;
        }
    }
}
