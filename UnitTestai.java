package app;

public class UnitTestai {

	public static void main(String[] args) {

		int[] arr2 = pentagoniniai(); 
		for(int i = 0 ; i < 50 ; i++) System.out.println(arr2[i]);
		
	}
	
	public int maziausiasSkaic(int[] arr) {
		int maz = arr[0];
		
		for(int i = 1 ; i < arr.length ; i++) {
			if(maz > arr[i]) maz = arr[i];
		}
		
		
		return maz;
	}
	
	public double vidurkisSkaic(int[] arr) {
		double vidurk = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			vidurk += (double)arr[i];
		}
		vidurk = vidurk / (double)arr.length;
		return vidurk;
	}
	
	public String vidurysString(String eilute) {
		
		String tarp = new String();
		if(eilute.length()%2 == 0)tarp = eilute.substring(eilute.length()/2-1, eilute.length()/2+1);
		else tarp = eilute.substring(eilute.length()/2, eilute.length()/2+1);
		
		return tarp;
	}

	public int balsesString(String eilute) {
		
		int count = 0;
		
		for(int i = 0 ; i < eilute.length() ; i++) {
			char tarp = eilute.charAt(i);
			if(tarp == 'a'|| tarp == 'e'|| tarp == 'i' || tarp == 'o' || tarp == 'u')count++;
		}
		
		return count;
	}
	
	public int zodziaiString(String eilute) {
		
		String[] eiluteMas = eilute.split(" ");
		
		
		
		return eiluteMas.length;
	}
	
	public int sumaSkaitmenu(int skaic) {
		int suma = 0 ;
		
		while(skaic > 0) {
			suma += skaic % 10;
			skaic = skaic / 10;
		}
		
		return suma;
	}
	
	public static int[] pentagoniniai() {
		int [] mas = new int[50];
		for(int i = 1 ; i <= 50 ; i++) {
			mas[i-1] = i * (i+1)/2 + i * (i-1);
		}
		
		return mas;
	}
}
