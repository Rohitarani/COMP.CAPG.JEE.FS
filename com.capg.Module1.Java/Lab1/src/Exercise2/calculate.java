package Exercise2;

public class calculate {
	int sum=0,add=0;
	int i,diff;
	
	int calculateSum(int n)
	{
		for(i=1;i<=n;i++)
		{
			sum=sum+i*i;
			add=(add+i);
			
	
		}
		add=add*add;
		diff=sum-add;
		return(diff);// TODO Auto-generated method stub

	}
}
