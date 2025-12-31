package test;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				arr[j] = j+1;
				System.out.print(arr[j]);
			}
			for(int k=0; k<i; k++) {
				arr[k] = k+1;
				System.out.print(arr[k]);
			}
			System.out.println(" ");
			  
			}
		
		}
	}
