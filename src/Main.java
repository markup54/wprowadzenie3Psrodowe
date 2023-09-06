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
            int roznica = liczbaWylosowana > wpisana ? liczbaWylosowana - wpisana : wpisana - liczbaWylosowana;
            /*
            wyrażenie warunkowe
            warunek ? jezeli prawda : jezeli fałsz
             */
            roznica = roznica /10;
            //dzielenie calkowite, jeżeli dzielimy liczby całkowite to wynik też jest calkowity
            switch (roznica){
                case 0:
                    System.out.println("Było bardzo blisko");
                    break;
                case 1:
                    System.out.println("Niezle");
                    break;
                case 2:
                    System.out.println("trochę brakowało");
                    break;
                default:
                    System.out.println("Może innym razem będzie lepiej");
            }
        }

    }
}