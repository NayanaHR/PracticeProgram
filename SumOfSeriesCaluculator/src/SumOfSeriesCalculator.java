
public class SumOfSeriesCalculator{
 double sum=0.0;
	double findSum(int n) 
 {
	 for(int i=1;i<=n;i++)
	 {
		  sum=sum+1.0/i;
	 }
	 return sum;
	 
 }
}
