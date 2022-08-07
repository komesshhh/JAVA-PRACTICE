
package com.komesh.Intrduction;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Array
{
	public static void main(String []args) {
		int c =' ';
		char d=' ';
		String e="";
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char []b=a.toCharArray();
		for(int i=0;i<a.length();i++) {
			c=(int) b[i]+1;
			d= (char) c;
			e=""+d;
			System.out.print(e.replace("!"," "));
		}
	}

}
