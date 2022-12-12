package helpers;



public class Sort {
	//for sorting array of Strings
	public void sortArr(String[] arr) {
		Compare c = new Compare();
		String min;
		int minindex = 0;
		boolean found;
		for(int i=0;i<arr.length-1;i++) {
			min = arr[i];
			found = false;
			for(int j=i;j<arr.length;j++) {
				if(c.compare(arr[j], min) < 0) {
					found = true;
					min = arr[j];
					minindex = j;
				}
			}
			if(found) {
				String temp;
				temp = arr[i];
				arr[i] = arr[minindex];
				arr[minindex] = temp;
			}
		}
	}
	
	//for sorting array of integers
	public void sortArr(int[] arr) {
		int min;
		int minindex = 0;
		boolean found;
		for(int i=0;i<arr.length-1;i++) {
			min = arr[i];
			found = false;
			for(int j=i;j<arr.length;j++) {
				if(arr[j] < min) {
					found = true;
					min = arr[j];
					minindex = j;
				}
			}
			if(found) {
				int temp;
				temp = arr[i];
				arr[i] = arr[minindex];
				arr[minindex] = temp;
			}
		}
		
	}
}
