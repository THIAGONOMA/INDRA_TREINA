package lista2701;

public class Hora {
	
	int hora, minuto, segundo;
	
	public Hora(int hora, int minuto, int segundo){
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;	
		
	}
	
	public String toString(){
		
		return hora + ":" +minuto + ":" + segundo;				
	}
	
	
}
