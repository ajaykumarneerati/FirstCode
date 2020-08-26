package com.main;

public class JavaRecursion {
	
	public static void main (String[] args) {
		
	/*	int num = sum (44);
		
		System.out.println(num);
			
			
	}

	public static int sum (int k) {
		
		if (k > 0) {
			
			return k + sum (k-1);
		}
			
			else {
				
				return 0;
			}
		*/
		
		
		int num = sum(1, 5);
		
		System.out.println(num);
	}
		public static int sum(int start, int end) {
		
		if (start > end) {
			
			return end + sum (start, end -1);
					}
			
		else {
			
			return end;
		}
			
			
		}
		
	}

