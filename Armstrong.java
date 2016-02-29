public class Armstrong {
	
	
	//tests if a number is an Armstrong number.
	private boolean isArmstrong(int test){
		int temp = test, r=0, sum=0;
		
		while (temp !=0){
			r = temp%10;
			temp /=10;
			sum = sum+ (r*r*r);	
			}
		return (sum==test?true:false);
	}
	
	public static void main (String[] s){
	
		Armstrong test = new Armstrong();
		int testNum = 100;

		//Searches all 3 digit numbers and prints all Armstrong numbers found.
		System.out.println("Searching all 3 digit numbers for Armstrong numbers...");
		for (int i = testNum; i <=999; i++){
			if (test.isArmstrong(i)==true)
				System.out.println(i+" is an Armstrong number.");
//			test.isArmstrong(i) ? System.out.println(i+" is an Armstrong number.") : ;
//		System.out.println(i+" "+(test.isArmstrong(i)?"is ":"is NOT ")+"an Armstrong number.");				
		}
//		System.out.println(testNum+" "+(test.isArmstrong(testNum)?"is ":"is NOT ")+"an Armstrong number.");
	
	
	}

}