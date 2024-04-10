package Huyen;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculatorThread implements Runnable {
	private Student student;
	public AgeCalculatorThread(Student student) {
		this.student = student;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		LocalDate birthDate = LocalDate.parse(student.getDateOfBirth());
		LocalDate currentDate = LocalDate.now();
		 Period age = Period.between(birthDate, currentDate);
		 String encodedAge = encodeAge(age.getYears());
		}

	private String encodeAge(int years) {
		// TODO Auto-generated method stub
		return String.valueOf(years);
	}

}
