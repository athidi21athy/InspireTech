package com.athidi21athy.inspireTech;
public class inspireTech {
    public static void main (String[] args) {

            Normaliser n = new Normaliser();
            String normalisedText = n.normalise("Java Engineer");
            System.out.println(normalisedText);
            normalisedText = n.normalise("C# Engineer");
            System.out.println(normalisedText);
            normalisedText = n.normalise("Chief Accountant");
            System.out.println(normalisedText);


           ArrayManipulator arman = new ArrayManipulator();
           arman.getStats(arman.createRandomArray());

    }
}
