package sg.edu.ntu.tests;
import sg.edu.ntu.classes.Ex0105InvoiceItem;

public class TestEx0105InvoiceItem {

	public static void main(String[] args) {
		Ex0105InvoiceItem i1 = new Ex0105InvoiceItem("01", "arroz", 3, 5.99);
		
		System.out.println("O total � " + i1.getTotal());
		System.out.println(i1);
	}	
}
