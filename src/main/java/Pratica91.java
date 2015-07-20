
import java.io.IOException;
import static java.lang.System.out;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DANIEL
 */
public class Pratica91 {

    public static void main(String[] args) throws IOException {

        Runtime rt = Runtime.getRuntime();
        String os = System.getProperty("os.name");
        out.println(os);

        long memoriaTotal = rt.totalMemory() / 1000000;
        long memoriaLivre = rt.freeMemory() / 1000000;
        long memoriaMaxima = rt.maxMemory() / 1000000;

        out.println(rt.availableProcessors());
        out.println(memoriaTotal);
        out.println(memoriaLivre);
        out.println(memoriaMaxima);

    }

}
