public class SpinWords {

    public String spinWords(String sentence) {
       String [] parts = sentence.split(" ");
        StringBuilder sp = new StringBuilder();
        for (String part:parts) {
            if(part.length()>=5) {

                StringBuilder word = new StringBuilder();
                word.append(part);
                word.reverse();
                sp.append(word).append(" ");
            }
            else {
                sp.append(part).append(" ");
            }
        }
        sp.deleteCharAt(sp.length()-1);
        return sp.toString();
    }

}