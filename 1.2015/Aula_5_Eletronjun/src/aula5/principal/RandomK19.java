package aula5.principal;

import java.util.Random;

public class RandomK19 {
    public static void main(String[] args)
    {
        Random gerador = new Random();
 
        int resultado = gerador.nextInt();
 
        System.out.println(resultado % 10);
    }
}