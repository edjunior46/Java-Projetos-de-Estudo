import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionarios newFunc;

        Scanner sc = new Scanner(System.in);

        List<Funcionarios> func = new ArrayList<>();
        
        System.out.print("Quantos funcionários deseja registrar?: ");
        int qtde = sc.nextInt();

        for (int i = 0; i < qtde; i++) {
            System.out.println();
            System.out.printf("Funcionário %d: %n", (i + 1));
            sc.nextLine();
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();

            newFunc = new Funcionarios(id, nome, salario);
            func.add(newFunc);
        }

        System.out.println();
        System.out.println(toString(func));

        System.out.println();
        System.out.print("Digite o id do funcionário que deseja aumentar o salário: ");
        Integer idAumento = sc.nextInt();
        System.out.print("Digite a porcentagem do salario que deseja aumentar: ");
        Double salarioAumento = sc.nextDouble();

        Funcionarios.aumentoSalario(idAumento, salarioAumento, func);

        System.out.println();
        System.out.println(toString(func));
        
        sc.close();

    }

    public static String toString(List<Funcionarios> func) {
        String result = "";

        for (int i = 0; i < func.size(); i++) {
            result += "\r\n" +
            func.get(i).getId() +
            ", " +
            func.get(i).getNome() + 
            ", " +
            String.format("R$%.2f", func.get(i).getSalario());
        }

        return result;
    }
}
