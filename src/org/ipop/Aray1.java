package org.ipop;

public class Aray1 {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	System.out.println(a[2]+"  "+a[3]+"  "+a[4]+"  "+a[0]+"  "+a[1]);
	int  b[] = {12,45,53,78,89,54,15,12};
	System.out.println(a[0]+"  "+a[1]+"  "+a[2]+"  "+a[4]+"  "+a[3]);
System.out.println(a.length);
System.out.println(b.length);
System.out.println(" **********normal for loop **********");
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]);
	System.out.print("   ");
}
System.out.println();
for(int i=0;i<b.length;i++) {
	System.out.print(b[i]);
	System.out.print("  ");
}
//Enhenced for loop
System.out.println();
System.out.println("*******Enhenced for loop ******");
//for(datatype varname : storevar)
for(int c : a) {
	System.out.print(c);
	System.out.print("  ");
}
System.out.println();
for(int m : b) {
	System.out.print(m);
	System.out.print("  ");
}

}
}
