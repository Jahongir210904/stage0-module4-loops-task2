package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if(multiplyByAndToInclusive>0){
            int counter=0;
            while(counter<=multiplyByAndToInclusive){
                System.out.println(counter*multiplyByAndToInclusive);
                counter++;
            }
        } else if (multiplyByAndToInclusive<0) {
            int temp=-1*multiplyByAndToInclusive;
            int counter=0;
            while (counter<=temp){
                System.out.println(counter*multiplyByAndToInclusive);
                counter++;
            }
        }
    }
}
