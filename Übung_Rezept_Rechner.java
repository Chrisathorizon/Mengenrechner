import java.util.Scanner;

public class Übung_Rezept_Rechner {
    public static void main(String[] args) {

        //Zutaten
        double Eier;
        double Zucker;
        double Milch;
        double Salz;
        double Mehl;
        double Backpulver;

        //Einheiten
        String EierEi;
        String KilogrammGramm;
        String LiterMilliliter;
        String PrisenPrise;

        //Sonstiges
        Scanner scan = new Scanner(System.in);
        int Auswahl;
        double Portionen;

        //Auswahl des Rezeptes (Pfannkuchen, Crepe, Pancake)
        System.out.println("Was möchtest du gerne machen? Tippe die entsprechende Zahl ein:");
        System.out.println("1 = Pfannkuchen");
        System.out.println("2 = Crepes");
        System.out.println("3 = Pancakes");

        Auswahl = scan.nextInt();

        if(Auswahl == 1 || Auswahl == 2 || Auswahl == 3) {

            if(Auswahl == 1) { //Pfannkuchen
                System.out.println("Okay, du möchtest gerne Pfannkuchen machen!");
                //Variablen Deklination für Pfannkuchen
                Eier = 4;           //Stk.
                Zucker = 2;         //EL
                Milch = 400;        //ml
                Salz = 1;           //Prise
                Mehl = 200;         //g
                Backpulver = 1;     //Msp.

                //Code für Pfannkuchen
                System.out.println("Wie viele Portionen Pfannkuchen möchtest du denn gerne machen?");

                Portionen = scan.nextDouble();

                //Überprüfung, ob Portionsanzahl plausibel ist
                if(Portionen > 0) { //plausibel

                    //Zutatenmengen berechnen
                    Eier = Eier * Portionen;                //Stk.
                    Zucker = Zucker * Portionen;            //EL
                    Milch = Milch * Portionen;              //ml
                    Salz = Salz * Portionen;                //Prise
                    Mehl = Mehl * Portionen;                //g
                    Backpulver = Backpulver * Portionen;    //Msp

                    //Einheiten festlegen
                    if(Eier >1) {
                        EierEi = "Eier";
                    } else {
                        EierEi = "Ei";
                    }

                    if(Milch > 1000) {
                        LiterMilliliter = "l";
                        Milch = Milch / 1000;
                    } else {
                        LiterMilliliter = "ml";
                    }

                    if (Mehl > 1000) {
                        KilogrammGramm = "kg";
                        Mehl = Mehl / 1000;
                    } else {
                        KilogrammGramm = "g";
                    }

                    if(Salz > 1) {
                        PrisenPrise = "Prisen";
                    } else {
                        PrisenPrise = "Prise";
                    }

                    //Ausgabe Pfannkuchen
                    System.out.println("Hier sind die Zutatenmengen für " + Portionen + " Portionen Pfannkuchen:");
                    System.out.println(Eier + " " + EierEi);
                    System.out.println(Zucker + " EL Zucker");
                    System.out.println(Milch + " " + LiterMilliliter + " Milch");
                    System.out.println(Salz + " " + PrisenPrise + " Salz");
                    System.out.println(Mehl + " " + KilogrammGramm + " Mehl");
                    System.out.println(Backpulver + " Msp Backpulver");

                } else { //unplausibel
                    System.out.println("Das ist ja quatsch!");
                }


            }
            if(Auswahl == 2) { //Crepes
                System.out.println("Okay, du möchtest gerne Crepes machen!");
                //Variabeln Deklination für Crepes
                Eier = 1;           //Stk.
                Zucker = 1;         //EL
                Milch = 200;        //ml
                Salz = 1;           //Prise
                Mehl = 100;         //g

                //Code für Crepes
                System.out.println("Wie viele Portionen Crepes möchtest du denn gerne machen?");

                Portionen = scan.nextDouble();

                //Überprüfung, ob Portionsanzahl plausibel ist
                if(Portionen > 0) { //plausibel

                    //Zutatenmengen berechnen
                    Eier = Eier * Portionen;                //Stk.
                    Zucker = Zucker * Portionen;            //EL
                    Milch = Milch * Portionen;              //ml
                    Salz = Salz * Portionen;                //Prise
                    Mehl = Mehl * Portionen;                //g

                    //Einheiten festlegen
                    if(Eier >1) {
                        EierEi = "Eier";
                    } else {
                        EierEi = "Ei";
                    }

                    if(Milch > 1000) {
                        LiterMilliliter = "l";
                        Milch = Milch / 1000;
                    } else {
                        LiterMilliliter = "ml";
                    }

                    if (Mehl > 1000) {
                        KilogrammGramm = "kg";
                        Mehl = Mehl / 1000;
                    } else {
                        KilogrammGramm = "g";
                    }

                    if(Salz > 1) {
                        PrisenPrise = "Prisen";
                    } else {
                        PrisenPrise = "Prise";
                    }

                    //Ausgabe Crepes
                    System.out.println("Hier sind die Zutatenmengen für " + Portionen + " Portionen Crepes:");
                    System.out.println(Eier + " " + EierEi);
                    System.out.println(Zucker + " EL Zucker");
                    System.out.println(Milch + " " + LiterMilliliter + " Milch");
                    System.out.println(Salz + " " + PrisenPrise + " Salz");
                    System.out.println(Mehl + " " + KilogrammGramm + " Mehl");

                } else { //unplausibel
                    System.out.println("Das ist ja quatsch!");
                }

            }
            if(Auswahl == 3) { //Pancakes
                System.out.println("Okay, du möchtest gerne Pancakes machen!");
                //Variabeln Deklination für Pancakes
                Eier = 2;           //Stk.
                Zucker = 2;         //EL
                Milch = 200;        //ml
                Salz = 1;           //Prise
                Mehl = 200;         //g
                Backpulver = 1;     //TL

                //Code für Pancakes
                System.out.println("Wie viele Portionen Pancakes möchtest du denn gerne machen?");

                Portionen = scan.nextDouble();

                //Überprüfung, ob Portionsanzahl plausibel ist
                if(Portionen > 0) { //plausibel

                    //Zutatenmengen berechnen
                    Eier = Eier * Portionen;                //Stk.
                    Zucker = Zucker * Portionen;            //EL
                    Milch = Milch * Portionen;              //ml
                    Salz = Salz * Portionen;                //Prise
                    Mehl = Mehl * Portionen;                //g
                    Backpulver = Backpulver * Portionen;    //Msp

                    //Einheiten festlegen
                    if(Eier >1) {
                        EierEi = "Eier";
                    } else {
                        EierEi = "Ei";
                    }

                    if(Milch > 1000) {
                        LiterMilliliter = "l";
                        Milch = Milch / 1000;
                    } else {
                        LiterMilliliter = "ml";
                    }

                    if (Mehl > 1000) {
                        KilogrammGramm = "kg";
                        Mehl = Mehl / 1000;
                    } else {
                        KilogrammGramm = "g";
                    }

                    if(Salz > 1) {
                        PrisenPrise = "Prisen";
                    } else {
                        PrisenPrise = "Prise";
                    }

                    //Ausgabe Pancakes
                    System.out.println("Hier sind die Zutatenmengen für " + Portionen + " Portionen Pancakes:");
                    System.out.println(Eier + " " + EierEi);
                    System.out.println(Zucker + " EL Zucker");
                    System.out.println(Milch + " " + LiterMilliliter + " Milch");
                    System.out.println(Salz + " " + PrisenPrise + " Salz");
                    System.out.println(Mehl + " " + KilogrammGramm + " Mehl");
                    System.out.println(Backpulver + " Msp Backpulver");

                } else { //unplausibel
                    System.out.println("Das ist ja quatsch!");
                }
            }

            System.out.println("Guten Hunger wünsche ich!");


        } else {
            System.out.println("Deine Eingabe ist ungültig");
        }






    }
}
