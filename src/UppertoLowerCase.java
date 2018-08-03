import java.util.Scanner;

public class UppertoLowerCase
{
	public static void main(String[] args)
	{
		upperToLowerCase();
	}
	public static void upperToLowerCase()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s;
		s = in.nextLine();
		String temp="\0";
		for (int i = 0; i < s.length(); i++)
		{
			char c=s.charAt(i);
			if(c>=65 && c<=90)
				c+=32;
			temp+=c;

		}
		System.out.print(temp);
	}

}
