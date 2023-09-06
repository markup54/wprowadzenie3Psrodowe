import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
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

        LinkedList<Integer> trafione = new LinkedList<>();
        //jeżeli jakaś liczba będzie i w wylosowane i w wpisane to dać do trafione
        for(Integer wylosowana:wylosowane ){
            if(liczbyWczytane.contains(wylosowana)){
                trafione.add(wylosowana);
            }
        }
        System.out.println("Trafiono "+trafione);
        //różnica pomiędzy typami prostymi i złozonymi
        int liczba1 =20; // typy proste tylko zmienne, nie mają metod

        Integer liczba2 =30; //typy złożone zawsze pisane z wielkiej litery
        //obiekty które mają własności i metody

    }
}
