package Huyen;

import java.time.LocalDate;

public class PrimeCheckerThread implements Runnable {
	private Student student;
	private boolean isPrime;
	
	public PrimeCheckerThread(Student student) {
		this.student = student;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int sumOfDigits = calculateSumOfDigits(student.getDateOfBirth());
		boolean isPrime = isPrimeNumber(sumOfDigits);
	}

	private boolean isPrimeNumber(int sumOfDigits) {
		// TODO Auto-generated method stub
		return false;
	}

	private int calculateSumOfDigits(String dateOfBirth) {
		LocalDate birthDate = LocalDate.parse(dateOfBirth);
		int day = birthDate.getDayOfMonth();
		int month = birthDate.getMonthValue();
		int year = birthDate.getYear();
		int sum = 0;
		while (day >0) {
			sum += day % 10;
			day /= 10;
		}
		while ( month >0) {
			sum += month % 10;
            month /= 10;
		}
		while (year > 0) {
            sum += year % 10;
            year /= 10;
        }
		return sum;
	}
	public boolean isPrime() {
		return isPrime;
	}

}
