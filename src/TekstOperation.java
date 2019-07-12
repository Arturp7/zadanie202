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

       boolean equals = true;

           equals = new StringBuilder(tekst).reverse().toString().equalsIgnoreCase(tekst);


        return equals;
    }


}
