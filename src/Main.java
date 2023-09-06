import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Gra graPierwsza = new Gra();
        graPierwsza.zagraj();
        graPierwsza.zagraj();
        //TODO:Losowanie tylko raz i wpisywanie od nowa
        Gra graDruga = new Gra();
        graDruga.zagraj();
    }
}
