package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("INPUT.TXT")));
        String dnaString = bufferedReader.readLine();
        String dnaStringMutant = bufferedReader.readLine();
        System.out.println("DNA: " + dnaString + " " + "\n" + "DNA MUTANT: " + dnaStringMutant);
        char[] dna = new char[dnaString.length()];
        char[] dnaMutant = new char[dnaStringMutant.length()];
        for (int i = 0; i < dnaString.length(); i++) {
            dna[i] = dnaString.charAt(i);
        }
        for (int i = 0; i < dnaStringMutant.length(); i++) {
            dnaMutant[i] = dnaStringMutant.charAt(i);
        }
        String string = "NO";
        int j = 0;
        for (int i = 0; i < dna.length; i++) {
            while (j < dnaMutant.length) {
                if (dna[i] == dnaMutant[j]) {
                    if (i == dna.length - 1) {
                        string = "YES";
                    }
                    ++j;
                    break;
                }
                ++j;
            }
            if (j == dnaMutant.length)
                break;
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("OUTPUT.TXT")));
        bufferedWriter.write(string);
        bufferedWriter.close();
    }
}
