package ChineseZodiac;

public class ChineseZodiac {

    public static String getTiere(int jahr) {

        String[] tiere = {
            "Affe","Hahn","Hund","Schwein",
            "Ratte","Ochse","Tiger","Hase",
            "Drache","Schlange","Pferd","Ziege"
        };

        int index = jahr % 12;

        for(int i = 0; i < tiere.length; i++){
            if(i == index){
                return tiere[i];
            }
        }

        return "";
    }
}
