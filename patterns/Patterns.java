class Patterns{
    public static void pattern1(int max){
    	
    	for(int outerCount = 1;outerCount<=max;outerCount++){
    		for(int innerCount = 1;innerCount <=outerCount;innerCount++){
    			System.out.print("* ");
    		}
    		System.out.println();
    	}

        /*
        Algorithm
        max = No. or Rows 
        1. Repeat outercount = 1 to outerCount <= max
             Repeat inmerCount = 1 to innerCount <= outerCount
             print("* ")
           print("\n") after inner loop ends    
         
       
       OUTPUT
       innerCount  outerCount     innerCount<=outerCount  
            1          1                    1<=1 true            *
            2		   1					2<=1 false

            1          2					1<=2 true			 *
            2          2					2<=2 true			 * *		
    	    3          2                    3<=2 false
            
            1          3                    1<=3 true            *
            2		   3					2<=3 true            * *
            3		   3					3<=3 true			 * * *
            4          3                    4<=3 false

            1          4                    1<=4 true            *
            2		   4					2<=4 true            * *
            3		   4					3<=4 true			 * * *
            4          4                    4<=4 true            * * * *
            5          4					5<=4 false

            1          5                    1<=5 true            *
            2		   5					2<=5 true            * *
            3		   5					3<=5 true			 * * *
            4          5                    4<=5 true            * * * *
            5		   5					5<=5 true			 * * * * *
            6          5                    6<=5 false
            
 
    	*/
    }

	public static void main(String []args){
     pattern1(5);
	}
}

