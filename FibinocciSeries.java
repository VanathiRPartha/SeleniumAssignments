package week1.day1.assigment;

public class FibinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstNum = 0, secondNum = 1, sum;

System.out.println(firstNum);
System.out.println(secondNum);

for (int i = 0; i <= 8; i++) {
	
	sum = firstNum + secondNum;
	
	System.out.println(sum);
	
	firstNum = secondNum;
	secondNum = sum;
	
}
	}

}
