package com.stockers.search;

public class BinarySearch {
	public int binarySearch(double[] a,int left,int right,double val) {
		int mid=(left+right)/2;
			
		while(left<=right) {
			if(a[mid]==val) {
				return mid;
			}
			else if(val>a[mid]) {
				return binarySearch(a,mid+1,right,val);
			}
			else{
				return binarySearch(a,left,mid-1,val);
			}
		}
		return -1;
	}
}
