import java.util.ArrayList;
import java.util.Scanner;

public class Estatistica_Arraylist{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Digite uma lista de números inteiros(para parar, digite letra): ");
        while(leia.hasNextInt()){
            numeros.add(leia.nextInt());
        }
        if(numeros.isEmpty()){
            System.out.println("Nenhum número foi digitado!");
            return;
        }
        int soma = 0;
        int min = numeros.get(0);
        int max = numeros.get(0);
        for(int num : numeros){
            soma += num;
            if(num < min) min = num;
            if(num > max) max = num;
        }
        double media = (double)soma / numeros.size();
        int moda = numeros.get(0);
        int maiorCont = 0;
        for(int num : numeros){
            int cont = 0;
            for(int outro : numeros){
                if(num == outro) cont++;
            }
            if(cont > maiorCont){
                maiorCont = cont;
                moda = num;
            }
        }
        double somaQuad = 0;
        for(int num : numeros){
            double dif = num - media;
            somaQuad += dif * dif;
        }
        double desvio = Math.sqrt(somaQuad / numeros.size());
        System.out.println(" ");
        System.out.println("Média = " + media);
        System.out.println("Moda  = " + moda);
        System.out.println("Menor = " + min);
        System.out.println("Maior = " + max);
        System.out.println("Desvio = " + desvio);
    }
}
