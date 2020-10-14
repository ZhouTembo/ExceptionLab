package main;

public class BadNameException extends Exception{
	public BadNameException() {
		super("I don not like this name");
	}
}