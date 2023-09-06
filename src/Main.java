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

    }
}