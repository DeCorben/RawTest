package com.blackmanatee.rawtest;
import java.io.*;

public class RawTest {
	private static boolean pass;
	private static int testNum;
	
	public static void echo(String e) {
		System.out.println(e);
	}
	
	public void check(boolean b) {
		pass = pass && b;
	}
	
	public void test() {
		if(pass)
			echo("Test number "+testNum+": passed");
		else
			echo("Test number "+testNum+": failed");
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
		echo("Begin phase: "+p);
	}
	
	public boolean treeEquals(File ay, File b){
		//compare files and subfolders for equality
		return false;
	}
}
