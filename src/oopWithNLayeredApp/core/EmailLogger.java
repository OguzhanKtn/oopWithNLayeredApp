package oopWithNLayeredApp.core;

public class EmailLogger implements Logger{

	@Override
	public void log(String data) {

		System.out.println("E-mail has sent :" + data);
		
	}

}
