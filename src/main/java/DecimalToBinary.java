
public class DecimalToBinary {
	
	public DecimalToBinary() {
		decimalToBinary(5);
	}
	
	
	public void decimalToBinary(int a){

		String binary = "";
		while(a>=2){
			binary = a % 2 + " " + binary;
			a/=2;
		}
		binary = a  + " " + binary;
		System.out.println(binary);
	}
}
