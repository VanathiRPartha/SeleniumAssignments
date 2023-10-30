package week1.day1.assigment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=18, count=0;
		
		System.out.println("Given number is "+num);
		
		for (int i = 1; i <= num; i++) {
			
			if(num%i==0)
			{
				count++;
			}
		}	
			
			if(count==2)
			{
				System.out.println("The number is Prime ");
			}else
				System.out.println("The number is not Prime");
		}

	}


