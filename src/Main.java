import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Zostanie wylosowana jedna liczba z zakresu od 1 do 100");
        int liczbaWylosowana = (int)(Math.random()*100+1);//zakres <0,1)
        System.out.println(liczbaWylosowana);
        /*
        rzutowanie z double do int
        rzutowanie zawezajace (int)

        typy proste
        boolean
        char

        byte
        int
        byte do int rzutowanie które nic nie traci
        z int do byte zawezam

         */
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę z zakresu 1 do 100");
        int wpisana = klawiatura.nextInt();
        System.out.println("Wstawiono "+wpisana);
        if(liczbaWylosowana == wpisana){
            System.out.println("Gratulacje");
        }
        else {
            System.out.println("Innym razem");
        }

    }
}