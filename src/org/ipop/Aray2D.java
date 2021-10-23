package org.ipop;

public class Aray2D {
	public static void main(String[] args) {
		int a[][]=new int[2][3];
		a[0][0]=23;
		a[0][1]=1;
		a[0][2]=3;
		a[1][0]=78;
		a[1][1]=45;
		a[1][2]=56;
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(a.length);//2
System.out.println("*****normal for loop*********");
		for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++){
		
			System.out.print(a[i][j]+"  ");
	}
		System.out.println();
}
		
	//	System.out.println();
	System.out.println("*** enhenced for loop****");
	for(int []x : b) {
		for(int y :x) {
			System.out.print(y+"  ");
		}
	System.out.println();
	
	
	}
		
		
	}

}
