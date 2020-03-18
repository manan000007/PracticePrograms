import java.util.ArrayList;

public class LongestDistinctCharacters {

	public static void main(String[] args) {

		
		int max=Integer.MIN_VALUE;
		String str="abca";
		for(int j=0;j<str.length();j++)
		{
			for(int k=j+1;k<=str.length();k++)
			{
				String str1=str.substring(j,k);
				if(distinct(str1))
				{
					if(max<str1.length())
					{
						max=str1.length();
					}
				}
			}
		}
		System.out.println(max);
	}
	
	public static boolean distinct(String str)
	{
		ArrayList<Character> list=new ArrayList<>();
		for(int i=0;i<str.length();i++)
		{
			if(list.contains(str.charAt(i)))
			{
				return false;
			}
			else
			{
				list.add(str.charAt(i));
			}
		}
		return true;
	}

}
