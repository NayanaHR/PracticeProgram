
public class Amstrong {
	int checkAmstrongNumber(int n)
	{
		int am=0;
		while(n!=0)
		{
			int rem=n%10;
			am=(rem^3)+am;
			n=n/10;
		}
		return am;
	}

}
