public class Meme{
	public static void main(String[] args){
		double n = 153,len = 0,temp = 0,op = 0,i;
		
		temp = n;
		while(temp!=0)
		{
			temp = temp/10;
			len++;
		}
		temp = n;
		while(temp!=0)
		{
			i = temp%10;
			op = op + (Math.pow(i,len));
			temp = temp/10;
		}
		if(op == n)
		{
			System.out.println("The given number is an armstrong number");
		}
		else
		{
			System.out.println("The given number is not an armstrong number");
		}
	}
}