import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao3 {
	public static void main(String []args){
        int k = 3;
        String s = "ashley", t = "ash";
        String retorno = concatERemove(s,t,k);
        System.out.println(retorno);
    }
    
    public static String concatERemove(String s, String t, int k) {
        Pattern pattern = Pattern.compile("^[a-z]+$");
        
        if(k < 1 || k > 100 || 
           s.length() < 1 || s.length() > 100 || 
           t.length() < 1 || t.length() > 100 || 
           !pattern.matcher(s).find() || !pattern.matcher(t).find()) {
            
            return "Revise os valores";
            
        }else {
               int tamanhoTotal = s.length() + t.length();
               if (tamanhoTotal <= k) {
                   return "Sim";
               }
           
               int tamanhoComum = 0;
               for (int i = 0; i <  Math.min(s.length(), t.length()); i++) {
                   if (s.charAt(i) != t.charAt(i)) {
                       break;
                   }
                   tamanhoComum++;
               }
               
               int minOp = tamanhoTotal - 2 * tamanhoComum;
           
               return ((minOp <= k && ((k - minOp) % 2 == 0)) ? "Sim" : "Não");

       }
    
   }
}
