package lab1;
import java.util.Scanner;
/*
 * C2=1 01 '-'
 * C3=2 C=2
 * C5=0 02 '*'
 * C7=4 char
 */

public class lab1
{
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("������� ������ ���� n:");
		int n = num.nextInt();
		System.out.print("������� ������ ���� m:");
		int m = num.nextInt();
		System.out.print("������� ����� ���� a:");
		int a = num.nextInt();
		System.out.print("������� ����� ���� b:");
		int b = num.nextInt(); 
		int S=0;
		final int C=2;
		
		if(n<a)
		{
			System.out.println("������ ��������� n");
			System.out.print("n=");
			n = num.nextInt();
		}
		if(m<b)
		{
			System.out.println("������ ��������� n");
			System.out.print("n=");
			n = num.nextInt();
		}
		for(char i=(char)a; i<n; i++)
		{
			if(i==C)
			{
				System.out.print("ĳ����� �� 0");
				break;
			}
			for(char j=(char)b; j<m; j++)
			{
				S+=((double)(i*j)/(i-C));
			}
		}
		System.out.print(S);
	}
}