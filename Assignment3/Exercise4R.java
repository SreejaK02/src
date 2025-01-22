package Assignment3;

import java.util.*;
public class Exercise4R {
	private static int matrix[][] = {
			//public static void main(String args[]) {
			 {1, 7, 3, 9, 5, 3},
			{6, 2, 3},
			 {7, 5, 1, 4, 0},
			 {1, 0, 2, 9, 6, 3, 7, 8, 4}
			};
	public static void main(String args[]) {
	// Scanner obj=new Scanner(System.in);
	//System.out.print("Enter digit: ");
	//int NumToFind=obj.nextInt(); 
	/*if(args.length==0) {
		System.out.println("Please provide a number between 0 and 9 as an argument.");
        return;
	}
	*/
	int NumToFind = Integer.parseInt(args[1]);
    if (NumToFind < 0 || NumToFind > 9) {
        System.out.println("Please provide a number between 0 and 9.");
        return;
    }
	int[] result=findFirstOccurrence(matrix,NumToFind); 
	if (result != null) {
        System.out.println("Digit " + NumToFind + " found at row " + result[0] + ", column " + result[1]);
    } else {
        System.out.println("Enter a number between 0-9");
    }
    
    //obj.close();
	}

	private static int[] findFirstOccurrence(int[][] matrix, int digit) {
		int row=matrix.length;			
					for(int i=0;i<row;i++) {
						for(int j=0;j<matrix[i].length;j++) {
							if(matrix[i][j]==digit) {
								return new int[] {i,j};
							}
							
							
						}
				 }
					return null;
	}

}
