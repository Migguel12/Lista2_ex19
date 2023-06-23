import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um numero inteiro menor que 1000: ");
        int n1 = ler.nextInt();
        System.out.println("");

        System.out.print(n1 + " = ");

        int centena = n1 / 100;
        int dezena = (n1 % 100) / 10;
        int unidade = (n1 % 100) % 10;

        if(centena < 0 ){}
        if(centena == 1 && dezena >= 1 && unidade >= 1){
            System.out.print(centena + " centena, ");
            
        }
        if(centena > 1 && dezena >= 1 && unidade >= 1){
            System.out.print(centena + " centenas, ");
            
        }
        if(centena == 1 && dezena <= 0 && unidade >= 1){
            System.out.print(centena + " centena e ");
            
        }
        if(centena > 1 && dezena <= 0 && unidade <= 0){
            System.out.print(centena + " centenas ");
            
        }
        if(centena == 1 && dezena <= 0 && unidade <= 0){
            System.out.print(centena + " centena ");
            
        }
        if(centena > 1 && dezena <= 0 && unidade >= 1){
            System.out.print(centena + " centenas e ");
            
        }
        if(centena > 1 && dezena >= 1 && unidade <= 0){
            System.out.print(centena + " centenas e ");
            
        }
        if(centena == 1 && dezena >= 1 && unidade <= 0){
            System.out.print(centena + " centena e ");
            
        }
        
        

        
        if(dezena <= 0){}
        if(dezena == 1 && unidade == 0){
            System.out.print(dezena + " dezena ");

        }
        if(dezena > 1 && unidade == 0){
            System.out.print(dezena + " dezenas ");
            
        }if(dezena == 1 && unidade >= 1){
            System.out.print(dezena + " dezena e ");

        }
        if(dezena > 1 && unidade >= 1){
            System.out.print(dezena + " dezenas e ");
            
        }
        

        
        if(unidade <= 0){}
        if(unidade == 1){
            System.out.print(unidade + " unidade ");
            
        }
        if(unidade > 1){
            System.out.print(unidade + " unidades ");

        }

    }
}
