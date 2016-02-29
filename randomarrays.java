import java.util.*;

public class randomarrays {
	private Random ran = new Random();
	
	public int[][] makeArray(int size){
		int[][] construct = new int[size][size];
	
		for (int i=0; i < construct.length; i++)
			for (int j=0; j < construct[i].length; j++)
				construct[i][j]=ran.nextInt(30);
		
		return construct;
	}		

	public void zeroArray(int[][] target) {
				
		for (int i=0; i < target.length; i++)
			for (int j=0; j < target[i].length; j++)
				target[i][j]=0;								
	}
	
	public void display(int[][] x){
		for (int i = 0; i < x.length; i++){
			for (int j = 0; j < x[i].length; j++)
				System.out.printf("%2d ", x[i][j]);
			System.out.println();
		}
	}
}