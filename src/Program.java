import java.util.Scanner;
import entidades.*;
import TYPEEN.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Program {
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do cliente: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date date = sdf.parse(sc.next());
        cliente clin = new cliente(name, email, date);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
		Orderstatus status = Orderstatus.valueOf(sc.next());


        System.out.print("quantos itens serao encomendados? ");
        int n = sc.nextInt();
        sc.nextLine();

        order order = new order(new Date(), status, clin);

        for(int i=1;i<=n;i++){
            System.out.println("Entre com os dados do #" + i + " pedido");
            System.out.print("Nome do produto: ");
            String nome = sc.nextLine();
            System.out.println("Preco do produto: ");
            Double preco = sc.nextDouble();
            System.out.println("Quantidade: ");
            int quantidade = sc.nextInt();
            sc.nextLine();

            produto prod = new produto(nome, preco);
            Orderitem it = new Orderitem(quantidade, preco, prod);

            order.addItem(it);

        }
        System.out.println();
		System.out.println("DADOS DO PEDIDO: ");
		System.out.println(order);
     
        sc.close(); 
    }
}
