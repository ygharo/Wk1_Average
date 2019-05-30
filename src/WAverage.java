import java.text.DecimalFormat ;
public class WAverage {

	public static void main(String[] args)  {

	int	testsc1 = 75 ;
	int testsc2 = 95 ;
	int testsc3 = 85 ;
	int testsc4 = 55 ;
	int testsc5 = 65 ;
	int testsc6 = 70 ;

	double w1 = 0.10 ;
	double w2 = 0.20 ;
	double w3 = 0.25 ;
	double w4 = 0.25 ;
	double w5 = 0.10 ;
	double w6 = 0.10 ;

	double TestsWeighted = ((testsc1 * w1) + (testsc2 * w2) + (testsc3 * w3) + (testsc4 * w4) + (testsc5 * w5) + (testsc6 * w6)) ;

	System.out.print("The six test scores and their respective weights:\n\t") ;
	System.out.printf("%-5d %2f\n\t", testsc1, w1);
	System.out.printf("%-5d %2f\n\t", testsc2, w2);
	System.out.printf("%-5d %2f\n\t", testsc3, w3);
	System.out.printf("%-5d %2f\n\t", testsc4, w4);
	System.out.printf("%-5d %2f\n\t", testsc5, w5);
	System.out.printf("%-5d %2f\n\t", testsc6, w6);

	int assigsc1 = 55 ;
	int assigsc2 = 65 ;
	int assigsc3 = 65 ;
	int assigsc4 = 60 ;
	int assigsc5 = 55 ;
	int assigsc6 = 50 ;

	double aweight1 = 0.05 ;
	double aweight2 = 0.10 ;
	double aweight3 = 0.15 ;
	double aweight4 = 0.25 ;
	double aweight5 = 0.25 ;
	double aweight6 = 0.20 ;

	double Assigaverage = ((assigsc1 * aweight1) + (assigsc2 * aweight2) + (assigsc3 * aweight3) + (assigsc4 * aweight4) + (assigsc5 * aweight5) + (assigsc6 * aweight6)) ;

	double FinalAverage = ((TestsWeighted + Assigaverage) /2) ;

	System.out.print("\nThe six assignment scores and their respective weights:\n\t") ;
	System.out.printf("%-5d %2f\n\t", assigsc1, aweight1);
	System.out.printf("%-5d %2f\n\t", assigsc2, aweight2);
	System.out.printf("%-5d %2f\n\t", assigsc3, aweight3);
	System.out.printf("%-5d %2f\n\t", assigsc4, aweight4);
	System.out.printf("%-5d %2f\n\t", assigsc5, aweight5);
	System.out.printf("%-5d %2f\n\t", assigsc6, aweight6);

	DecimalFormat fmt = new DecimalFormat("#.##");
	System.out.print("\n The weighted average of the six test scores is " + fmt.format(TestsWeighted)) ;
	System.out.print("\n The weighted average of the six assignment scores is " + fmt.format(Assigaverage)) ;
	System.out.print("\n The master average between the two weighted averages is " + fmt.format(FinalAverage)) ;

	}

}
