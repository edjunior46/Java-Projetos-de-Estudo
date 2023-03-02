import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.SavingsAccount;
import entities.BusinessAccount;

public class App {
    public static void main(String[] args) throws Exception {

        /* Com classe abstrata, evitamos que sejam instanciados objetos do tipo da
        superclasse
        Account acc1 = new Account(1001, "Alex", 1000.0);
        */

        List<Account> list = new ArrayList<Account>();
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(acc2);
		list.add(acc3);
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
        
    }
}
