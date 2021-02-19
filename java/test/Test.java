package test;

import nsgl.array.Array;

public class Test {
    public static void main(String[] args) {
	Array<Integer> a = new Array<Integer>();
	for(int i=0; i<1000; i++)
	    a.add(i);
	System.out.println("****************");
	for(int i=0; i<1000; i++)
	    System.out.print(" "+a.get(i));

	System.out.println("\n****************");	
	for(int i:a)
	    System.out.print("*"+i);
	
	for(int i=0; i<100; i++)
	    a.remove(i*10);
	System.out.println("\n****************");	
	for(int i:a)
	    System.out.print(" "+i);
    }
}
