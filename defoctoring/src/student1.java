
public class student1 extends PERSON {

			private static final String PREFIX = "R/BCA-2019";
			Results data = new Results();
			private String rollno;
			private char grade;
			String joinyear;
			student1(String name, String rollno, int [] marks)
			{
				this.name = name;
				this.rollno = rollno;
				this.data.marks = marks;
			}
			String getName()
			{
			return name;
			}
			void display_results()
			{
			//compute average
				char grade;
				float avg = computeAvg();
				
				//compute grade
				grade = computegrade(avg);
				
				//print the results
				System.out.println("Result of " + name.toUpperCase());
				System.out.println("Roll no is " + PREFIX + rollno);
				System.out.println("Grade is " + grade);
				}
			private char computegrade(float avg) {
				boolean bRangeforGradeA = avg >80;
				boolean bRangeforGradeB = avg >60 && avg <=80;
				boolean bRangeforGradeC = avg >50 && avg <=60;
				boolean bRangeforGradeD = avg >40 && avg <=50;
				
				if(bRangeforGradeA)
				grade = 'A';
				else {
					
					if (bRangeforGradeB)
					grade = 'B';
					else {
						
						if (bRangeforGradeC)
						grade = 'C';
						else {
							
							if (bRangeforGradeD)
							grade = 'D';
							else
							grade = 'F';
						}
					}
				}
				return grade;
			}
			public float computeAvg() {
				int sum=0;
				float avg=0;
				char grade;
				for (int i=0; i< data.marks.length;i++)
				sum+= data.marks[i];
				avg = sum/data.marks.length;
				return avg;
			}
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int[] marks = {90,80,70,56,89};
				student1 sue = new student1("Anne Sue", "777", marks);
				sue.display_results();

			}
		

}
