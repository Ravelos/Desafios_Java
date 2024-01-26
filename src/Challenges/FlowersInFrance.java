

public class FlowersInFrance {
    public static String checkTautogram(String word){

        if(word == null || word.isEmpty() || word.isBlank()){
            throw new IllegalArgumentException("Frase inválida.");
        }
        String[] tautogramArray = word.split("\\s+");
        if (tautogramArray.length == 1 ){
            throw new IllegalArgumentException("Frase inválida.");
        }
        return checkFirtsLetter(tautogramArray);
    }

    public static String checkFirtsLetter(String[] words){
        char firstLetter = Character.toLowerCase(words[0].charAt(0));
        for (String word:words) {
            if (!word.toLowerCase().startsWith(String.valueOf(firstLetter))) {
                return "N";
            }
        }
        return "S";
    }
}
