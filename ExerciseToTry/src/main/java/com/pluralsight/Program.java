package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        Pair<Musician> duet = new Pair<Musician>(new Violinist(),
                new Cellist());
        duet.perform();
    }

}
