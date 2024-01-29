package array_for_loop;

 class Find_Largest_No_In_Array {

	public static void main(String[] args) {
		
		int i, max;
		int[] arr = { 1, 2, 3, 4, 5 };
		for ( i = 0; i<arr.length; i++) {
			System.out.println("" + arr[i]);
		}
		
		max=arr[0];
		for( i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("largest no. in the array:"+max);
		
		

	}
}