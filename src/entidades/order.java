package entidades;
import java.util.Date;
import TYPEEN.Orderstatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class order {
    
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private Orderstatus status;
    private List<Orderitem> itens = new ArrayList<>();
    private cliente clin;


    public order(){
    }

    public order(Date moment, Orderstatus status, cliente clin){
        this.moment = moment;
        this.status = status;
        this.clin = clin;
    }
    public Orderstatus getStatus(){
        return status;
    }
    public void setStatus(Orderstatus status){
        this.status = status;
    }
    public Date getMoment(){
        return moment;
    }
    public void setMoment(Date moment){
        this.moment = moment;
    }

    public List<Orderitem> getItens(){
        return itens;
    }
    public void addItem(Orderitem item){
        itens.add(item);
    }
    public void removeItem(Orderitem item){
        itens.remove(item);
    }

    public double total() {
		double sum = 0.0;
		for (Orderitem it : itens) {
			sum += it.subTotal();
		}
		return sum;
	}
    public cliente getClin(){
        return clin;
    }
    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Horario do pedido:  ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Status do pedido: " );
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(clin + "\n");
		sb.append("Itens encomendados: \n");
		for (Orderitem item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
