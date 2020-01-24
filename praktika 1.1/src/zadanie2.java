import java.util.Scanner;
public class zadanie2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double y1;
		double y2;
		int d;
		System.out.print("Введите 1 коэффицент");
		Integer a = in.nextInt();
		System.out.print("Введите 2 коэффицент");
		Integer b = in.nextInt();
		System.out.print("Введите 3 коэффицент");
		Integer c = in.nextInt();
		d=b*b-4*a*c;
		int factor = (d>0)?2:((d<0)?0:1);
		System.out.println(factor);
		y1=(-b+Math.sqrt(d))/(2*a);
		y2=(-b-Math.sqrt(d))/(2*a);
		System.out.println("Корень 1="+y1+",Корень 2="+y2);
	}

}
