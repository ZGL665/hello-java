package day8_25;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.TemporalField;
import java.util.Calendar;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		
		
		long time=System.currentTimeMillis();
		System.out.println(time);
		
		Date d1=new Date();
		
		System.out.println(d1);
		
		Date d2=new Date(0);
		
		System.out.println(d2);
		
		Date d3=new Date("2021/1/1 20:30:20");
		
		System.out.println(d3);
		
		Date d4=new Date(2021-1900, 1, 1, 3, 50);
		
		System.out.println(d4);
		
		System.out.println(d1.after(d2));
		
		System.out.println(d1.before(d2));
		
		System.out.println(d1.compareTo(d2));
		
		System.out.println(d1.compareTo(d1));
		
		Date d5=new Date();
		
		Date d6=new Date();
		System.out.println(d5.equals(d6));
		System.out.println("===================");
		Calendar c1=Calendar.getInstance();
		
		System.out.println(c1);
		System.out.println(c1.get(Calendar.DATE));
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));

		c1.add(Calendar.DAY_OF_MONTH, -2);
		
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println("set方法");
		
		c1.set(2021, 2, 3);
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH));
		System.out.println(c1.get(Calendar.DATE));
		
		
		System.out.println("===============");
		
		Instant instant= Instant.now();
		
		System.out.println(instant);
		
		LocalDate ld=LocalDate.now();
		
		System.out.println(ld.getYear());
		
		LocalDate l2=LocalDate.now();
		
		l2=l2.plusDays(2);
		System.out.println(l2);
		LocalDate l3=l2.plusMonths(2);
		System.out.println(l3);
		
		Period p=Period.between(l2, l3);
		System.out.println(p);
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());
		
		
		
		
		
		
	}

}
