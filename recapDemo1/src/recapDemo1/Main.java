package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayı1 = 200;
		int sayı2 = 250;
		int sayı3 = 260;
		
		int enBüyük = sayı1 ;
		if (enBüyük<sayı2) {
			enBüyük = sayı2 ;
		}
       
		if (enBüyük<sayı3) {
			enBüyük = sayı3 ;
        }
		System.out.println("En Büyük = "+enBüyük);
		
		
		
	} 

}
