public class SelectionSort {
	public static void main(String[] args) {
		// System.out.println("Hello " + args[0]);
		int[] ary;
		ary = new int[]{3,2,1,5,4};
		
		for (int i = 0; i < ary.length; i++){
			int min = i;
				
			for (int j = i; j < ary.length; j++){
				if(ary[min] > ary[j]){
					min = j;
				}
			}
			
			if (min < ary[i]) {
				int temp = ary[i];
				ary[i] = ary[min];
				ary[min] = temp;
			}
		}
		
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i] + " ");
		}
	}
}