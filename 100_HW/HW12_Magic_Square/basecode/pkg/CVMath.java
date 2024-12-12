package pkg;

public class CVMath {
	public CVMath(){
		
	}
	public void magicSquare(int a){
		int squares = 0;
		int magic = 0;
		int b = 0;
		
		for(int i = 0; true; i++){
			squares = i * i;
			for(int j=1; j<=squares; j++){
				magic = magic + j;
				if(magic == squares){
					System.out.println(squares);
					b=b+1;
				}
			}
			if(b>=a){
				break;
			}
			squares = 0;
			magic = 0;
		}
	}
	
}
