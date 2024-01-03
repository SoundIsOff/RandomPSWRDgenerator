
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
         String[] chars = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c",
                "d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8",
                 "9","@","#","%","&","/","?","$"};

         int range = chars.length;
        String[] pasword = new String[9];

        for (int i=0; i<9;i++){
            pasword[i]=chars[n(range)];
        }
        System.out.println("Nueva contraseña generada aleatoriamente: "+show(pasword));

    }

    public static int n(int range){
        double random =  Math.random()* (range);
        return (int) random;
    }
    public static String show(String[] pasword){
        String resul="";
        for (String s : pasword) {
            resul += s;
        }
        return resul;
    }


}
