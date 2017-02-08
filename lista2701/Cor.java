package lista2701;

public class Cor {
	
	int red, green, blue;
     
	public Cor(){
		
	}
	
	public Cor (int red, int green, int blue){
		this.red = red;
		this.green = green;
		this.blue = blue;
		}
		
	public Cor (int red, int green){
		this.red = red;
		this.green = green;
		}
		
	public Cor (int red){
		this.red = red;
		}
	
	public String obtercor(){
		
	return red + "," +  green + "," + blue;	
		
	}
	
}
	

