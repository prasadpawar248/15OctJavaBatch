package ArrayProgram;

public class FindStudentPassedOrFailed 
{
	public static void main(String[] args)
	{
		int marks[] = {70,68,40,35,80,90,33,45,50,80};
		
		int count=0;
		for(int i=0;i<marks.length; i++)
		{
			if(marks[i]<=40)     // Passing marks is 40
			{
				count++;
			}
		}
		if(count<4)
		{
			System.out.println("Student is passed");
		}
		else
		{
			System.out.println("Student is failed");
		}
	}

}
