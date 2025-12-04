public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] primes = new boolean[n +1];
        for (int i = 2; i < primes.length; i ++)
        {
            primes [i] = true;
        }
        int p = 2;
        while (p <= Math.sqrt(n)) 
        {
            for (int i = 2; i < primes.length; i ++)
            {
                if (i != p && i % p == 0) 
                {
                   primes[i] = false; 
                }
            }
            p++;
        }
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        for (int i = 2; i < primes.length; i ++)
        {
            if (primes[i] == true) 
            {
                System.out.println(i);
                count ++;
            }
        }
        int precent = 100 * count / n;
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + precent + "% are primes)");
    }
}