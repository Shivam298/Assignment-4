8
public class Main
{
	public static void main(String[] args) {
		Customer ram=new Customer("Ram");
		Product pr=new Product("Iphone",40000);
		Product pr2=new Product("Smasung",50000);
		Cart cart=new Cart();
		cart.add(pr);
		cart.add(pr2);
		ram.add(cart.get());
		ram.showDetails();
	}
}
