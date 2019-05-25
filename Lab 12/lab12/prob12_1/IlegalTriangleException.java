package prob12_1;

public class IlegalTriangleException extends  IllegalClosedCurveException{
	public IlegalTriangleException() {
		super();
	}
	public IlegalTriangleException(String msg) {
		super(msg);
	}
	public IlegalTriangleException(Throwable t) {
		super(t);
	}

}
