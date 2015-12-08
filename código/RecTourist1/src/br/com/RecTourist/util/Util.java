package br.com.RecTourist.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Util {

	/**
	 * pega a data atual do sistema no formato dd/MM/yyyy
	 * 
	 * @return
	 */
	public static String getDataAtual() {
		Calendar calendar = new GregorianCalendar();
		SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		calendar.setTime(date);
		return out.format(calendar.getTime());
	}

}
