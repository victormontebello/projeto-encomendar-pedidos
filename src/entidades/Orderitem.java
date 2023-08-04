package entidades;

public class Orderitem {
    private Integer quantity;
    private Double price;
    private cliente clin;
    private produto prod;

    public Orderitem(Integer quantity, Double price, produto prod) {
        this.quantity = quantity;
        this.price = price;
        this.prod = prod;
    }
    public Orderitem(){
    }
    public Integer getQuantity(){
        return quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public Double subTotal(){
        return quantity * price;
    }
    public cliente getClin(){
        return clin;
    }
    public void setClin(cliente clin){
        this.clin = clin;
    }
    public produto getProd(){
        return prod;
    }
    public void setProd(produto prod){
        this.prod = prod;
    }
    @Override
	public String toString() {
		return prod.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantidade: " 
				+ quantity + 
				", Valor total: $" 
				+ String.format("%.2f", subTotal());
	}

}
