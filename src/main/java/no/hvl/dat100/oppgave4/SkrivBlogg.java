package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        File file = new File(mappe, filnavn);

        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print(samling.toString());
            return true;  

        } catch (FileNotFoundException e) {
            System.out.println("Error: Unable to write to file " + file.getPath());
            e.printStackTrace();
            return false; 
        }
    }
}

