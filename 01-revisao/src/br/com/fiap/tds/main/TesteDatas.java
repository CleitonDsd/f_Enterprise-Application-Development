package br.com.fiap.tds.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TesteDatas {
	public static void main(String[] args) {
	 
		
		Calendar hoje = Calendar.getInstance();
		
		Calendar challenge = new GregorianCalendar();
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		//exibir a data
		System.out.println(format.format(hoje.getTime()));
		
	}
}
