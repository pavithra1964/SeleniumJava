package screenshots;



public class TryandCatchBlock {
	public static void main(String[] args) {
		
		//	int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		//	System.out.println(numbers[77]);  
			
			try
			{
				int numbers[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
				System.out.println(numbers[7]);	
			}
			
			catch(Exception e)
			{
				System.out.println("Wrong index you are accessing");
				System.out.println("Error due to the reson :"+e);
			}

		}

	}