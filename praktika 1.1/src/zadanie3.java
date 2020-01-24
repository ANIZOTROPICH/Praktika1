import java.util.Scanner;
public class zadanie3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("¬ведите первое число");
		Integer a = in.nextInt();
		System.out.print("¬ведите второе число");
		Integer b = in.nextInt();
		 while (a != b){
			 if (a > b) {
				a=a-b;
			 }
			 else {
				 b=b-a;
			 }
		 }
		 System.out.print(a);
	}

}
