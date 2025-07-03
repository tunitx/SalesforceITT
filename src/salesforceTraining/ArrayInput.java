package salesforceTraining;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int arr [] = new int[n];
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<n; i++ ) {
			System.out.print("Enter the number "+ i + ":" );
			arr[i] = sc.nextInt();
		}
		
		System.out.println("the input array is : ");
		for(int i : arr) {
			System.out.println(i);
		}
		
		//.clone creates a deep copy
		int copiedArr [] = arr.clone();
		
		for(int i =0; i<copiedArr.length/2; i++) {
			int temp = copiedArr[i];
			copiedArr[i] = copiedArr[n-i-1];
			copiedArr[n-i-1] = temp;
			
		}
		System.out.println("^^^^^^^^");
		
		for(int i : copiedArr) {
			System.out.println(i);
		}
		
		

	}

}
