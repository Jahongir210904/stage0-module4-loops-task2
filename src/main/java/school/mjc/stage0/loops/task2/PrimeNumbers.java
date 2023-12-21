package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter=2;
        while (counter<=printToInclusive){
            int i=2;
            while (i<=counter){
                if(counter==i && counter%i==0){
                    System.out.println(i);
                } else if (counter%i==0) {
                    break;
                }
                i++;
            }
            counter++;
        }
    }
}
