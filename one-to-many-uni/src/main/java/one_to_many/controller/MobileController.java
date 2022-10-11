package one_to_many.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.alvas.one_to_many.dao.MobileDao;
import org.alvas.one_to_many.dto.Mobile;
import org.alvas.one_to_many.dto.Sim;

public class MobileController {

	static Mobile mobile = new Mobile();
	static MobileDao mobiledao = new MobileDao();
	static Sim sim = new Sim();

	public static void main(String[] args
			) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Savemobiledetails");
			System.out.println("2.delete details");
			System.out.println("3. getbyid details");
			System.out.println("4. update details");
			System.out.println("Choose your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				Mobile mobile = new Mobile();
				MobileDao mobiledao = new MobileDao();
				Sim sim1 = new Sim();
				Sim sim2 = new Sim();

				mobile.setName("realme");
				mobile.setModel("pro");

				sim1.setName("abcfd");
				sim1.setProvider("airtel");

				sim2.setName("Realme");
				sim2.setProvider("jio");
				List<Sim> sim = Arrays.asList(sim1, sim2);
				mobile.setName("Redmi");
				mobile.setSim(sim);
				mobiledao.saveMobileSim(mobile, sim1, sim2);
			}
				break;
			case 2: {
				System.out.println("enter the id");
				int id = sc.nextInt();
				Mobile mobile = mobiledao.deleteMobileById(id);
			}
				break;
			case 3: {
				Mobile mob = new Mobile();
				System.out.println("Enter the customer id");
				int id3 = sc.nextInt();
				mobiledao.getById(id3);
			}
				break;
			case 4: {
				System.out.println("Enter the id");
				int id = sc.nextInt();
				System.out.println("Enter the name");
				String name = sc.next();
				System.out.println("Enter the sim model");
				String model = sc.next();
				mobiledao.updateById(id, name, model);
			}
			}
		}
	}
}