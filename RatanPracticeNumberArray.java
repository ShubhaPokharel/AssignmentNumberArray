class RatanPracticeNumberArray{
	public static void main(String[] args){
	int[] numbers = {1,3,7,6,10,20};

	 for(int i = 1; i<numbers.length; i++){
	  if(i == 6){
	   continue;
	  }
	  System.out.println(i);
	 }
	}
}