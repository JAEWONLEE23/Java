package MYST.ex01;

public class NotExistIDException extends Exception{
 public NotExistIDException() {}
 public NotExistIDException(String message) {
	super(message);
 }
}
