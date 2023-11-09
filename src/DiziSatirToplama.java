
public class DiziSatirToplama {
	public static void main(String[] args) {
		
		int dizi [][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for ( int i = 0 ; i < dizi.length ; i++ ) {
			
			for (int j = 0 ; j < dizi[i].length ; j++ ) {
				
				System.out.print(dizi[i][j] + " ");
			}
			
			System.out.println(" ");
		}
		
		System.out.println("2. satırın toplamı " );
		
		for (int m =1 ; m < 2 ; m++) {
			int toplam = 0 ;
			for(int n = 0 ; n < 3 ; n++ ) {
				
				toplam += dizi[m][n];
					
				
			}
		System.out.println(toplam);
			
		}
		
		
		
		}}

