public class Primes {
    public static void main(String[] args) {
        int primeCounter = 0;
        System.out.println("Prime numbers up to " + args[0] + ":");
        for(int i = 2 ; i <= Integer.parseInt(args[0]) ; i ++) {
            if(isPrime(i)) {
                System.out.println(i);
                primeCounter ++;
            }
        }
        int primeCounterPrecent =(int) (100*primeCounter/Integer.parseInt(args[0]));
        System.out.println("There are "+primeCounter+" primes between 2 and "+args[0]+" ("+primeCounterPrecent+"% are primes)");
    }

    public static boolean isPrime(int num) {
        for(int i = 2 ; i < num ; i ++) {
            if(num % i ==0) return false; // Checking the mod of each number between 2 and n-1
        }
        return true;
    }
}