public class Primes {
    public static void main(String[] args) {
        int primeCounter = 0;
        int num = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + num + ":");
        boolean [] arr = new boolean[num+1];
        arr[0] = false; 
        arr[1] = false;
        for(int i = 2 ; i < arr.length ; i ++) arr[i] = true;
        for(int i = 2 ; i < arr.length ; i ++) {
            if(isPrime(i)) {
                for(int k = i + 1 ; k < arr.length ; k ++) {
                    if(k % i == 0) arr[k] = false;
                }
            }
        }
        for(int i = 2 ; i < arr.length ; i ++) {
            if(arr[i]) {
                primeCounter++;
                System.out.println(i);
            }
        }
        int primeCounterPrecent =(int) (100*primeCounter/num);
        System.out.println("There are "+primeCounter+" primes between 2 and "+num+" ("+primeCounterPrecent+"% are primes)");
    }

    public static boolean isPrime(int num) {
        for(int i = 2 ; i < num ; i ++) {
            if(num % i ==0) return false; // Checking the mod of each number between 2 and n-1
        }
        return true;
    }

    
}