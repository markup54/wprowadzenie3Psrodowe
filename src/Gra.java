import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Gra {
    private static HashSet<Integer> wylosowane = new HashSet<>();
    private ArrayList<Integer> liczbyWczytane = new ArrayList<>();
    private LinkedList<Integer> trafione =new LinkedList<>();

    private void wylosujLiczby(){
        System.out.println("Zostanie wylosowanych 6 liczb z zakresu od 1 do 100");
        while(wylosowane.size()<6){
            wylosowane.add((int) (Math.random() * 100 + 1));
        }
    }
    private void wczytajLiczby(){
        //Wczytywać z klawiatury 6 liczb bez powtorzen
        liczbyWczytane = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        for(int i=0;i<6;i++){
            int liczba;
            do {
                System.out.println("Podaj liczbę");
                liczba = klawiatura.nextInt();

            }while (liczbyWczytane.contains(liczba));
            liczbyWczytane.add(liczba);
        }

    }
    private void sprawdzWyniki(){
        trafione =new LinkedList<>();
        for(Integer wylosowana:wylosowane ){
            if(liczbyWczytane.contains(wylosowana)){
                trafione.add(wylosowana);
            }
        }
    }
    public void zagraj(){
        wylosujLiczby();
        wczytajLiczby();
        sprawdzWyniki();
        System.out.println("Wczytane"+liczbyWczytane);
        System.out.println("Wylosowane"+wylosowane);
        System.out.println("Trfione"+trafione);
    }
}
