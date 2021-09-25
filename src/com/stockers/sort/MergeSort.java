package com.stockers.sort;

public class MergeSort {
	public void mergeDesc(double[] arr,int left,int mid,int right) {
		int len1=mid-left+1;
		int len2=right-mid;
		double leftArr[]=new double[len1];
		double rightArr[]=new double[len2];
		for(int i=0;i<len1;i++) {
			leftArr[i]=arr[left+i];
		}
		for(int j=0;j<len2;j++) {
			rightArr[j]=arr[mid+1+j];
		}
		int i=0,j=0;
		int k=left;
		while(i<len1 && j<len2){
			if(leftArr[i]<=rightArr[j]) {
				arr[k]=rightArr[j];
				j++;
			}
			else {
				arr[k]=leftArr[i];
				i++;
			}
			k++;
		}
		while(i<len1){
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<len2){
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}
	public void mergeAsc(double[] arr,int left,int mid,int right) {
		int len1=mid-left+1;
		int len2=right-mid;
		double leftArr[]=new double[len1];
		double rightArr[]=new double[len2];
		for(int i=0;i<len1;i++) {
			leftArr[i]=arr[left+i];
		}
		for(int j=0;j<len2;j++) {
			rightArr[j]=arr[mid+1+j];
		}
		int i=0,j=0;
		int k=left;
		while(i<len1 && j<len2){
			if(leftArr[i]>=rightArr[j]) {
				arr[k]=rightArr[j];
				j++;
			}
			else {
				arr[k]=leftArr[i];
				i++;
			}
			k++;
		}
		while(i<len1){
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j<len2){
			arr[k]=rightArr[j];
			j++;
			k++;
		}
	}
	public void sortDesc(double[] arr,int left,int right) {
		if(left<right) {
			int mid=(left+right) / 2;
			sortDesc(arr,left,mid);
			sortDesc(arr,mid+1,right);
			mergeDesc(arr,left,mid,right);	
		}
	}
	public void sortAsc(double[] arr,int left,int right) {
		if(left<right) {
			int mid=(left+right) / 2;
			sortAsc(arr,left,mid);
			sortAsc(arr,mid+1,right);
			mergeAsc(arr,left,mid,right);	
		}
	}
}
