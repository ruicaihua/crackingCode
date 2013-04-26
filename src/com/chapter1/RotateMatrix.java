package com.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RotateMatrix {

	/**
	 * 1.6 Given an image represented by an N×N matrix, where each pixel in the image is 4 bytes,
	 * write a method to rotate the image by 90 degree. Can you do this in place?
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader iStreamReader = new InputStreamReader(System.in);
		BufferedReader brBufferedReader = new BufferedReader(iStreamReader);
		boolean right = true;
		System.out.println("input 'quit' to quit!");
		System.out.println("please input the N!");
		while(right) {
			String string = brBufferedReader.readLine();
			int N = 0, i, j;
			try {
				if(string.equals("quit")) {
					right = false;
				}
				N = Integer.valueOf(string);
				/**
				 * 生成 N×N随机数的矩阵
				 */
				Random ran = new Random();
				int[][] a = new int[N][N];
				for(i=0;i<N;i++) {
					for(j=0;j<N;j++) {		
						int temp = ran.nextInt(100) + 1;
						a[i][j] = temp;
					}
				}
				System.out.println("Before rotate......");
				for(i=0;i<N;i++) {
					for(j=0;j<N;j++) {	
						System.out.print(a[i][j]);
						System.out.print(" ");
					}
					System.out.println();
				}
				rotate(a, N);
				System.out.println("After rotate......");
				for(i=0;i<N;i++) {
					for(j=0;j<N;j++) {	
						System.out.print(a[i][j]);
						System.out.print(" ");
					}
					System.out.println();
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("请输入矩阵大小（整型） ：");
			}
			
		}
	}
	
	private static void rotate(int[][] a, int N) {
		if(a==null || N <= 1) {
			return;
		}
		int round = N/2;
		for(int i=0;i<round;i++) {
			int len = N-i*2-1;
			for(int j=i;j<len;j++) {
				int temp = a[i][j];
				a[i][j] = a[len-j][i];
				a[len-j][i] = a[len-i][len-j];
				a[len-i][len-j] = a[j][len-i];
				a[j][len-i] = temp;
			}
		}
	}

}
