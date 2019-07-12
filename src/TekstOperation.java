public class TekstOperation {

    public int lengthCalc(String tekst) {
        String[] words = null;
        words = tekst.split(" ");
        int length = words.length;
        return length;
    }

    public int totalLenght(String tekst) {
        int total = tekst.length();

        return total;
    }

    public boolean palindrom(String tekst) {
        String[] words = null;
        words = tekst.split(" ");
       boolean equals = true;
        for (int i = 0; i < words.length-1; i++) {
           equals = new StringBuilder(words[i]).reverse().toString().equals(words[i]);

        }
        return equals;
    }


}
