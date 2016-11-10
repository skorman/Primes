import java.util.ArrayList;

public class PrimeFinder {
	
	public ArrayList<Integer> primes = new ArrayList<Integer>();
	public ArrayList<Integer> factors = new ArrayList<Integer>();
	private boolean isFactor = false;

	private void initializeList(int num){
		factors.add((Integer) 2);
		for(int i = 3; i < num; i+= 2){
			if (num % i == 0) factors.add((Integer) i);
		}
	}
	
	private void reduceList(int num){
		for(int i = 1; i < num; i++){
			isFactor = false;
			for(int x = 0; x < factors.size(); x++){
				if (i % factors.get(x) == 0) isFactor = true;
			}
			if (!isFactor) {
				primes.add((Integer) i);
			}
		}
	}
	
	public void findPrime(int num){
		initializeList(num);
		reduceList(num);
	}
	public ArrayList getPrime(int num){
		primes.clear();
		initializeList(num);
		reduceList(num);
		return primes;
	}

}
