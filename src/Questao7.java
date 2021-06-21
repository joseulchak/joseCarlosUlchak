public class Questao7{

     public static void main(String []args){
         String str = "Hello Radek";
         int stringLenght = 0;
         
         for(char c : str.toCharArray()) {
            stringLenght++;
        }
        System.out.println("Tamanho da String: " + stringLenght);
     }
        
}