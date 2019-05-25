package prob1;

import java.util.Arrays;

public class MyTable {
Entry[] entries=new Entry[26];
	
	public void add(char c, String s){
		int intValue=(int)c;
		int position=intValue-97;
		entries[position]=new Entry(c,s);	
	}
	public String get(char c){
		int intValue=(int)c;
		int position=intValue-97;
		Entry requiredS=entries[position];
		//String str=String.valueOf(entries[position]);
		return entries[position].toString(requiredS);
	}
	public String toString(){
		String input="";
		for (int i=0;i<entries.length;i++){
			if (entries[i]!=null)
			input+=String.format("%s -> %s  %n",entries[i].getChar(),entries[i].getString());
		}
		
		return input;
	}
	
	
	public static void main(String[] arg){
		MyTable t=new MyTable();
		t.add('a',"Andrew");
		t.add('b',"Billy");
		t.add('w', "Willie");
		System.out.println(t.toString());
	}
	
 class Entry{
		char c;
		String s;
		
		Entry(char c, String s){
			this.c=c;
			this.s=s;
			
			
		}
		private String getString(){
			return s;
		}
		public char getChar(){
			return c;
		}
		public String toString (Entry requiredS){
			return  String.valueOf(requiredS.getChar())+"-->"+requiredS.getString();
			
		}
	}
	
}
