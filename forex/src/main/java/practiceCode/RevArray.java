package practiceCode;

import java.util.Scanner;

public class RevArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int arr[]=new int[n];
	int temp=0;
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n-1;i++) {
		for(int j=0;j<n-1;j++)
		{if(arr[j]>arr[j+1]){
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;	}}}
	for(int k=0;k<n;k++){
		System.out.print(arr[k]+" ");}}}
