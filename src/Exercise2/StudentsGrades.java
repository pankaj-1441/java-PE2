package Exercise2;

import java.util.Scanner;

public class StudentsGrades {
     public static double avg(int[] grades) {
    	 int sum=0;
    	 int n=grades.length;
    	 for(int i=0;i<n;i++) {
    		 sum=sum+grades[i];
    	 }
    	 double average=sum/n;
    	 return average;
     }
    public static int max(int[] grades) 
     {   int i;
         int max = grades[0];    
         for (i = 1; i < grades.length; i++) { 
             if (grades[i] > max) {
                 max = grades[i]; 
             }
         }
         return max; 
     } 
     
     public static int min(int[] grades){
    	  int minValue = grades[0];
    	  for(int i=1;i<grades.length;i++){
    	    if(grades[i] < minValue){
    		  minValue = grades[i];
    		}
    	  }
    	  return minValue;
    	}
     public static void main(String[] args) {
		System.out.println("Enter number of Students: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] grades =new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the grade for student: ");
			grades[i]=sc.nextInt();
		}
		System.out.println("The average is: "+avg(grades));
		System.out.println("The maximum is: "+max(grades));
		System.out.println("The minimum is: "+min(grades));

		
	}
}
