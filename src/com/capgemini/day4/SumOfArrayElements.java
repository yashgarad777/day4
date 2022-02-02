package com.capgemini.day4;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int arr[]= {10,40,70};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			
		}
		System.out.println("sum of array elements ="+sum);
		
	}
}
