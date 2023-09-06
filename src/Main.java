import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Zostanie wylosowanych 6 liczb z zakresu od 1 do 100");
        HashSet<Integer> wylosowane = new HashSet<>();
        /*
        kolekcje:
        listy - ArrayList, LinkedList
        elementy uporządkowane indeksowane mogą sie powtarzać
        zbiory - HashSet
        elementy są zazwyczaj nieuporządkowane, nieindeksowane, nie moga się potwrzać
        mapy
         */
        while(wylosowane.size()<6){

            wylosowane.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(wylosowane);//adres obiektu
        for(int wylosowana:wylosowane){
            System.out.println(wylosowana+",");
        }
        //Wczytywać z klawiatury 6 liczb bez powtorzen
        Scanner klawiatura = new Scanner(System.in);
        ArrayList<Integer> liczbyWczytane = new ArrayList<>();
        for(int i=0;i<6;i++){
            int liczba;
            do {
                System.out.println("Podaj liczbę");
                liczba = klawiatura.nextInt();

            }while (liczbyWczytane.contains(liczba));
            liczbyWczytane.add(liczba);
        }
        System.out.println("Wczytane liczby "+liczbyWczytane);

    }
}
