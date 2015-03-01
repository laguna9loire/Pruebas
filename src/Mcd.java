
public class Mcd {
	public int a, b;	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int calculoMcd(){
		int aux;
		int res;
		int a=this.getA(), b=this.getB();
		if(a<b){
			aux=a;
			a=b;
			b=aux;
		}
		res=a%b;
		if(res==0){
			return b;
		}else{
			while (a%b!=0) {
				a=b;
				b= res;
				res=a%b;
			} 
			return b;
		}
	}
}
