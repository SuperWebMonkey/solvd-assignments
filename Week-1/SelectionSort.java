public class SelectionSort {
	public static void main(String[] args) {
		// System.out.println("Hello " + args[0]);
		int[] array;
		array = new int[]{3,2,1,5,4};
		
		for (int i = 0; i < array.length; i++){
			int min = i;
				
			for (int j = i; j < array.length; j++){
				if(array[min] > array[j]){
					min = j;
				}
			}
			
			if (min < array[i]) {
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}