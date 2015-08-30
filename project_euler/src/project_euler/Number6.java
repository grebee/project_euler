package project_euler;

public class Number6 {
	
	private int min;
	private int max;
	
	public Number6(){
		getSumOfSquare(min, max);
		getSquareOfSum(min, max);
	}
	
	
	public int getSumOfSquare(int min, int max) {
		
		int sumOfSquare = 0;
		int[] list = list(min, max);
		int[] tempList = list;
		
		for (int i = 0; i < tempList.length; i++) {
			sumOfSquare += square(tempList[i]);
		}
		
		return sumOfSquare;
	}
	
	public int getSquareOfSum(int min, int max){
		int squareOfSum = min;
		
		int[] list = list(min, max);
		int[] tempList = list;
		
		int temp=0;
		for (int i = 0; i < tempList.length; i++){
			temp = temp + tempList[i];
			squareOfSum = temp;
		}
		
		squareOfSum = square(squareOfSum);
		return squareOfSum;
	}
	

	public int square(int x) {
		int result = x * x;
		return result;
	}

	public int[] list(int min, int max) {
		int[] list = new int[max];
		for (int i = 0; i < max; i++) {
			list[i] = i+1;
		}
		return list;
	}

}
