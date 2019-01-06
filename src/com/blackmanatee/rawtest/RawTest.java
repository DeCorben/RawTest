package com.blackmanatee.rawtest;
import java.io.*;
import java.util.*;

public class RawTest {
	protected static boolean pass;
	private static int testNum,phaseNum = 0;
	protected static int threshold = 1;
	protected static boolean phaseEcho = false;
	protected static boolean failEcho = false;
	private static ArrayList<String> echoBuf;
	
	public static void echo(String e, int t) {
		//an echo that only prints if the test fails
		if(failEcho){
			echoBuf.add(e);
			return;
		}
		if(t == 0)
			System.out.println(e);
		else if(phaseEcho){
			if(t >= threshold && phaseNum >= threshold)
				System.out.println(e);
		}
		else if(t >= threshold)
			System.out.println(e);
	}
	
	public void check(boolean b) {
		pass = pass && b;
	}
	
	public void test() {
		if(pass)
			echo("Test number "+phaseNum+"."+testNum+":\t\t\t\tpassed",0);
		else{
			if(failEcho)
				for(String m:echoBuf){
					echo(m,0);
				}
			echo("Test number "+phaseNum+"."+testNum+":\t\t\t\tfailed",0);
		}
		testNum++;
		resetTest();
	}
	
	protected void resetTest() {
		pass = true;
		echoBuf = new ArrayList<>();
	}
	
	public void startPhase(String p) {
		resetTest();
		phaseNum++;
		testNum = 1;
		echo("Begin phase "+phaseNum+": "+p,0);
	}
	
	public boolean treeEquals(File ay, File b){
		//compare files and subfolders for equality
		return false;
	}
}
