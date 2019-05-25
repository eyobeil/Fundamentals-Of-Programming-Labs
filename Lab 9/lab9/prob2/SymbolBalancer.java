package prob2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER=""+(char)0;
	String filename;
	String text;
	static String result=null;
SymbolBalancer(String filename){
	this.filename=filename;
	result=readFile();	
}
public void setText(String text){
	this.text=text;
}
boolean symbolsBalanced(String delimiters){
	if (delimiters.length()%2!=0 | delimiters.length()==0)return false;
	Stack<Character> stack1=new Stack<>();
	for(int i=0;i<delimiters.length();i++){
		if (delimiters.charAt(i)=='('||delimiters.charAt(i)=='['||delimiters.charAt(i)=='{'){
		stack1.push(delimiters.charAt(i));
		}
		else {
			if (delimiters.charAt(i)==')'&&stack1.peek()=='('){stack1.pop();continue;}
			else
				if (delimiters.charAt(i)==']' && stack1.peek()=='[') {stack1.pop();continue;}
				else
				if (delimiters.charAt(i)=='}' && stack1.peek()=='{') {stack1.pop();continue;}    		
		}
		} 
	if (stack1.isEmpty())return true;
	else return false;
}
public static void main (String[] args){
	SymbolBalancer sb=new SymbolBalancer("C:\\Workspace\\Fpp\\src\\lab9_2\\readme.txt");
	System.out.println(sb.symbolsBalanced(result));
}

public String readFile(){
	try{
		Scanner sc=new Scanner(new File(filename));
		sc.useDelimiter(ODD_DELIMITER);
		System.out.println(sc);
		text=sc.next();
		System.out.println(text);
		sc.close();	
	}
	catch(FileNotFoundException ex){
		System.err.println("File Not Found Exception"+ex.getMessage());
	
	}
	return text;
}
}
