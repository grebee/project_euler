package project_euler;

public class Number7 {
	
	public int number;
	
	public Number7(){
		primeNumber(number);
		evenNumber(number);
	}
	
	public boolean primeNumber (int n){
		int temp = n-1;
		boolean pN = true;
		double round;
		if (evenNumber(n) == true){
			pN = false;
		}
		else{
			round = Math.sqrt(n);
			int temp_round = (int) Math.round(round);
			if  (round < temp_round){
				round = round + 1;
				temp = (int) round;
			}
			else
				temp = (int) round;
		
			while (temp > 1){
				if ( n % temp != 0){
					temp--;
				}
				if ( n % temp == 0) {
					pN = false;
					break;
				}
				if (temp == 2 && n % temp != 0) break;
				
			}	
		}
		return pN;
	}
	
	public boolean evenNumber (int n){
		if (n % 2 == 0)
			return true;
		else
			return false;
	}
}
