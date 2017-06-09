package AnandSirClass;

public class PermutationOfString {
	public static void p(StringBuilder str,int left,int right){
		if(left==right){
			System.out.println(str);
			return;
		}else{
			for(int i=left;i<right;i++){
				swap(str,i,left);
				p(str,left+1,right);
				swap(str,i,left);
			}
		}
	}
	static void swap(StringBuilder str,int i,int j){
		char c;
		c = str.charAt(i); 
		str.setCharAt(i, str.charAt(j)); str.setCharAt(j, c); 
	}
	public static void main(String args[]){
		StringBuilder str = new StringBuilder("SAITEJA");
		p(str,0,"SAITEJA".length());
	}
}
