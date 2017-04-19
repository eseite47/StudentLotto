import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class LotoTester
  {
	  public static void main (String[] args)
	  {
		  ArrayList<String> students = new ArrayList<String>();
		  int studentCount = 0;

		  System.out.println("How long is this loto?");		
		  Scanner in = new Scanner(System.in);
		  int length = in.nextInt();		
      
		  System.out.println("Please enter a student's name. Press q to end");		
		  Scanner in2 = new Scanner(System.in);

		  while (in.hasNext())
		  {
			  String name = in2.next();
			  if (name.equals("q")) break;
			
			  else
			  {
			    students.add(name);
			    studentCount++;
			  }
		  }
			
		for (String studentLoto : students)
		{
			System.out.print(studentLoto + " Loto Assignment : ");
			ArrayList<String> assignment = new ArrayList<String>();
				
			for (int i = 0; i < length; i++)
			{
				Random generator = new Random();
				int randomStudent = generator.nextInt(studentCount);

				String lotoassignment = students.get(randomStudent);
					
				
				if (studentLoto == lotoassignment)
				{
					i--;
				}
				
				else 
				{
					boolean duplicate = false;
					for (String assigned : assignment)
					{
						if (assigned.equals(lotoassignment))
						{
							i--;
							duplicate = true;
						}
					}
					if (!duplicate)
					{
						assignment.add(lotoassignment);
					}
				}
			}
			System.out.println(assignment);		
		}
    
	}
}
