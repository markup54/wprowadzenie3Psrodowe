import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Zostanie wylosowana jedna liczba z zakresu od 1 do 100");
        int liczbaWylosowana = (int) (Math.random() * 100 + 1);//zakres <0,1)
        System.out.println(liczbaWylosowana);
        System.out.println("Zgadnij liczbę");
        Scanner klawiatura = new Scanner(System.in);

        int wpisana = klawiatura.nextInt();
        while(wpisana != liczbaWylosowana) {
            if(wpisana>liczbaWylosowana){
                System.out.println("Wpisano za dużo");
            }
            else {
                System.out.println("Wpisano za mało");
            }
            System.out.println("Podaj liczbę z zakresu 1 do 100");
            wpisana = klawiatura.nextInt();

        }
        System.out.println("Gratulacje");
    }
}
