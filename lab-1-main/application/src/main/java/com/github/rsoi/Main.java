package com.github.rsoi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<Person> listOfPersons = new ArrayList<Person>();




		Person person1 = new Person("Stefania", 20, 2);

		ArrayList<Violation> listOfViolation1 = new ArrayList<>();


		listOfViolation1.add(new Violation("violation1_Stefania", new Date()));
		listOfViolation1.add(new Violation("violation2_Stefania", new Date()));
		listOfViolation1.add(new Violation("violation3_Stefania", new Date()));
		listOfViolation1.add(new Violation("violation4_Stefania", new Date()));
		listOfViolation1.add(new Violation("violation5_Stefania", new Date()));
		listOfViolation1.add(new Violation("violation6_Stefania", new Date()));
		listOfViolation1.add(new Violation("violation7_Stefania", new Date()));



		person1.setViolations(listOfViolation1);

		listOfPersons.add(person1);

		Person person2 = new Person("Vladislau", 22, 3);

		ArrayList<Violation> listOfViolation2 = new ArrayList<>();


		listOfViolation2.add(new Violation("violation1_Vladislau", new Date()));
		listOfViolation2.add(new Violation("violation2_Vladislau", new Date()));
		listOfViolation2.add(new Violation("violation3_Vladislau", new Date()));
		listOfViolation2.add(new Violation("violation4_Vladislau", new Date()));
		listOfViolation2.add(new Violation("violation5_Vladislau", new Date()));
		listOfViolation2.add(new Violation("violation6_Vladislau", new Date()));
		listOfViolation2.add(new Violation("violation7_Vladislau", new Date()));
		listOfViolation2.add(new Violation("violation8_Vladislau", new Date()));



		person2.setViolations(listOfViolation2);
				listOfPersons.add(person2);

		//количество нарушений (с определённой даты)
		System.out.print("Введите количество нарушений (с определённой даты)\n");
		Scanner violationTime = new Scanner(System.in);
		int violationTimes = violationTime.nextInt();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Date, look for 07/06/2013");

		String dateInString = scanner.next();

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = formatter.parse(dateInString);
			for (var person : listOfPersons) {
				for (var violation : person.getViolations()) {
					if ((violation.getViolation_date().compareTo(date)) > 0 && (violationTimes == person.getViolations().size())) {
						System.out.println(person.getName());
						break;
					}
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}



		// общая сумма потраченных средств.
		System.out.print("Введите общюю сумму потраченных средств.\n");
		Scanner general_cost = new Scanner(System.in);
		int general_costs = general_cost.nextInt();
		int sum = 0;
		for (var person : listOfPersons) {
			for (var travel : person.getTravels()) {
				sum += travel.getTravel_cost();
			}
			if(general_costs == sum){
				System.out.println("Имя человека: " + person.getName());
			}
		}



		// стаж
		System.out.print("Введите стаж.\n");
		Scanner experience = new Scanner(System.in);
		int experiences = experience.nextInt();
		for (var person : listOfPersons) {
			if(person.getExperience() == experiences){
				System.out.println("Имя человека с введенным стажем: " +person.getName());
			}
		}
	}
}
