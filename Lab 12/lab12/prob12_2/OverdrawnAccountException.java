package prob12_2;

public class OverdrawnAccountException extends Exception{
	
	public OverdrawnAccountException(){
	super();	
	}
	
	public OverdrawnAccountException(String msg){
		super(msg);	
		}
	
}
