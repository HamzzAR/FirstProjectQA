
public class DecimalToBinary {
	
	public DecimalToBinary() {
		decimalToBinary(8);
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
