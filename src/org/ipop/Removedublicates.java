package org.ipop;

import java.util.ArrayList;
import java.util.List;

public class Removedublicates {
public static void main(String[] args) {
	List<Integer>li=new ArrayList<>();
	li.add(10);
	li.add(10);
	li.add(20);
	li.add(50);
	li.add(60);
	li.add(80);
	li.add(60);
	li.add(50);
     System.out.println("Input  a[]= "+li);
li.remove(7);
li.remove(6);
li.remove(0);
System.out.println("Output  a[]= "+li);


}
}
