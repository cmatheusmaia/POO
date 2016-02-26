package Fatorial;

public class Fatorial {

	public int calcula(int n){
		
		int resultado = 1;
		if ( n > 1){
			for(int i =1;i<=n;i++){
				resultado *= i;
			}
		}
		return resultado;
	}
}
