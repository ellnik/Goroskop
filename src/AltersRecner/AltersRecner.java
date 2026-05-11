package AltersRecner;

public class AltersRecner {

    public static int rechnenTage(int t, int m, int j) {

        int tage = 0;

        int[] monate = {31,28,31,30,31,30,31,31,30,31,30,31};

        
        for(int jahr = j; jahr < 2026; jahr++){ //jahr
            if(isLeap(jahr)) tage += 366;
            else tage += 365;
        }

        
        for(int i = 0; i < m-1; i++){// monate
            tage += monate[i];
            if(i == 1 && isLeap(j)) tage += 1; 
        }

        
        tage += t;  // tage

        return tage;
    }

    public static boolean isLeap(int jahr){
        return (jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0);
    }
}
