import java.util.ArrayList;

public class Main {

	private static PrimeFinder primeFinder = new PrimeFinder();
	private static long num = 2;
	private static ArrayList<Double> differences = new ArrayList<Double>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println(primeFinder.getPrime(6));
		System.out.println(primeFinder.getPrime(30));
		System.out.println(primeFinder.getPrime(210));
		System.out.println(primeFinder.getPrime(6).size() / 6.0);
		System.out.println(primeFinder.getPrime(30).size() / 30.0);
		*/
		
		/*
		for(int i = 3; num < 270000; i+= 2){
			num *= i;
			double dif;
			if(i == 3 || i % 3 != 0 || true){
				dif = (primeFinder.getPrime(num).size() / (double) num);
				//System.out.println(primeFinder.getPrime(num).size() / (double) num);
				System.out.println(primeFinder.getPrime(num));
				differences.add((Double) dif);
			}
		}
		for(int x = 0; x < differences.size() - 1; x++){
			//System.out.println(differences.get(x) - differences.get(x + 1));
		}
		*/
		for(long i = 3; i <= 70; i+=2){
			num *= i;
			System.out.println(i);
			System.out.println(num - 1);
		}
		
	}

}
