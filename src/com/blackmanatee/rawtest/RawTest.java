package com.blackmanatee.rawtest;
import java.io.*;

public class RawTest {
	private static boolean pass;
	private static int testNum;
	protected static int threshold = 1;
	
	public static void echo(String e, int t) {
		//an echo that only prints if the test fails
		if(t == 0 || t > threshold)
			System.out.println(e);
	}
	
	public void check(boolean b) {
		pass = pass && b;
	}
	
	public void test() {
		if(pass)
			echo("Test number "+testNum+":\t\t\t\tpassed",0);
		else
			echo("Test number "+testNum+":\t\t\t\tfailed",0);
		testNum++;
		resetTest();
	}
	
	public void setTest(int i) {
		testNum = i;
	}
	
	protected void resetTest() {
		pass = true;
	}
	
	public void startPhase(String p) {
		resetTest();
		echo("Begin phase: "+p,0);
	}
	
	public boolean treeEquals(File ay, File b){
		//compare files and subfolders for equality
		return false;
	}
}
