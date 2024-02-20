package array_for_loop;

public class Sec_Largest_No_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		int[] arr = { 1, 2, 32, 4, 5, 6, 7 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
		System.out.println("second largest no. in array: " +arr[temp - 2]);
	}
}

// int len = arr.lenght;
// Arrays.sort(arr)
// System.out.println(arr[len-2]);

//int array[] = {10, 20, 25, 63, 96, 57};
//int size = array.length;
//Arrays.sort(array);
//System.out.println("sorted Array ::"+Arrays.toString(array));
//int res = array[size-2];
//System.out.println("2nd largest element is ::"+res);
//}
