package AnandSirClass;
/**
*
* @author saiteja21
*/
public class RecursionBinaryOfInt {
	public static void Bin(int val){
		if(val==0){ //gets out when the value reaches to 0
			return;
		}
		int bin = (val%2==0)?0:1;
		Bin(val/2); 
		// after getting out the current @param bin value is preserved in this call
		//stack so it is printed in the bellow, this traces back to all the calls.
		System.out.print(bin);
	}
	public static void main(String[] args) {
         Bin(10); //calling static function directly
	}
}
