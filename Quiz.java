import java.text.DecimalFormat; // Df is the class, 
//df with twodecimalplaces is the object 

/**
 * 
 *       (1 + h) ( 1 - f)

                3f /     h2 - x
 *
 */
public class Quiz {

	public static void main(String[] args) {
	
		int f = 9;
		int h = 7;
		int x = 4;
		double result; 
	 
		result = (( 1 + h ) * (1 - f )) / ((double)( 3 * f) / ( h * h - x )) ;
				System.out.println(result); 
	
	DecimalFormat dfWithTwoDecimalPlaces; 
	dfWithTwoDecimalPlaces = new DecimalFormat( " 0.00"); 
	System.out.println(dfWithTwoDecimalPlaces.format(result));
	
	}	
}
