package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String phrase="";
        int counter=0;
        while (counter<chars.length){
            phrase+=chars[counter];
            counter++;
        }
        System.out.print(phrase);
    }
}
