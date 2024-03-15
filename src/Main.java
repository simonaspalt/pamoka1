public class Main {
    public static void main(String[] args) {


        System.out.println("------------uzd1----------------");
        String vardas = "Simonas";
        String pavarde = "Paltanavicius";
        int gmetai = 1994;
        int data = 2024;
        System.out.println("A esu " + vardas + " " + pavarde + ". Man yra " + (data - gmetai) + " metai(u).");

        System.out.println("------------uzd2---------------");
        int min = 0;
        int max = 4;
        int num1 = (int) (min + Math.round(Math.random() * (max - min)));
        int num2 = (int) (min + Math.round(Math.random() * (max - min)));

        System.out.println(num1 + " " + num2);
        if (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                System.out.println(Math.round((double) num1 / num2 * 100) / 100.0);
            } else System.out.println(Math.round((double) num2 / num1 * 100) / 100.0);
        } else System.out.printf("dalyba is 0 negalima");

        System.out.println("-------------uzd 3------------------");


        int min1 = 0;
        int max1 = 25;
        int n1 = (int) (min1 + Math.round(Math.random() * (max1 - min1)));
        int n2 = (int) (min1 + Math.round(Math.random() * (max1 - min1)));
        int n3 = (int) (min1 + Math.round(Math.random() * (max1 - min1)));
        System.out.println(n1 + " " + n2 + " " + n3);
        if ((n1 < n2 && n1 > n3) || (n1 > n2 && n1 < n3)) System.out.println(n1);
        if ((n2 < n1 && n2 > n3) || (n2 > n1 && n2 < n3)) System.out.println(n2);
        if ((n3 < n1 && n3 > n2) || (n3 > n1 && n3 < n2)) System.out.println(n3);

        System.out.println("-------------uzd4-------------");

        int min2 = 1;
        int max2 = 10;
        int a = (int) (min2 + Math.round(Math.random() * (max2 - min2)));
        int b = (int) (min2 + Math.round(Math.random() * (max2 - min2)));
        int c = (int) (min2 + Math.round(Math.random() * (max2 - min2)));
        System.out.println(a + " " + b + " " + c);
        if ((a < b + c) || (b < a + c) || (c < a + b)) System.out.println("Trikampi sudaryti galima");
        else System.out.println("trikampio sudaryti negalima");

        System.out.println("----------------uzd5--------------");

        int min3 = 0;
        int max3 = 2;
        int nr1 = (int) (min3 + Math.round(Math.random() * (max3 - min3)));
        int nr2 = (int) (min3 + Math.round(Math.random() * (max3 - min3)));
        int nr3 = (int) (min3 + Math.round(Math.random() * (max3 - min3)));
        int nr4 = (int) (min3 + Math.round(Math.random() * (max3 - min3)));
        System.out.println(nr1 + " " + nr2 + " " + nr3 + " " + nr4);
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;

        if (nr1 == 0) {
            c1 = c1 + 1;
        } else if (nr1 == 1) {
            c2 = c2 + 1;
        } else {
            c3 = c3 + 1;
        }

        if (nr2 == 0) {
            c1 = c1 + 1;
        } else if (nr2 == 1) {
            c2 = c2 + 1;
        } else {
            c3 = c3 + 1;
        }

        if (nr3 == 0) {
            c1 = c1 + 1;
        } else if (nr3 == 1) {
            c2 = c2 + 1;
        } else {
            c3 = c3 + 1;
        }

        if (nr4 == 0) {
            c1 = c1 + 1;
        } else if (nr4 == 1) {
            c2 = c2 + 1;
        } else {
            c3 = c3 + 1;
        }

        System.out.println("nuliu yra: " + c1);
        System.out.println("vienetu yra: " + c2);
        System.out.println("dvejetu yra: " + c3);


        System.out.println("--------------uzd6-------------");


        int min4 = -10;
        int max4 = 10;
        int nmr1 = (int) (min4 + Math.round(Math.random() * (max4 - min4)));
        int nmr2 = (int) (min4 + Math.round(Math.random() * (max4 - min4)));
        int nmr3 = (int) (min4 + Math.round(Math.random() * (max4 - min4)));
        System.out.println(nmr1 + " " + nmr2 + " " + nmr3);
        if (nmr1 < 0) {
            System.out.println("[" + nmr1 + "]");
        } else if (nmr1 == 0) {
            System.out.println("(" + nmr1 + ")");
        } else {
            System.out.println("{" + nmr1 + "}");
        }

        if (nmr2 < 0) {
            System.out.println("[" + nmr2 + "]");
        } else if (nmr2 == 0) {
            System.out.println("(" + nmr2 + ")");
        } else {
            System.out.println("{" + nmr2 + "}");
        }

        if (nmr3 < 0) {
            System.out.println("[" + nmr3 + "]");
        } else if (nmr3 == 0) {
            System.out.println("(" + nmr3 + ")");
        } else {
            System.out.println("{" + nmr3 + "}");
        }

        System.out.println("-----------uzd7------------");

        int min5 = 5;
        int max5 = 3000;
        int zvakes = (int) (min5 + Math.round(Math.random() * (max5 - min5)));
        if (zvakes <= 1000) {
            System.out.println("zvakiu perkama: " + zvakes);
            System.out.println("vienos zvakes kaina: 1.00e");
            System.out.println("kaina viso: " + zvakes + "e");
        } else if (zvakes > 1000 && zvakes <= 2000) {
            System.out.println("zvakiu perkama: " + zvakes);
            System.out.println("vienos zvakes kaina: 0.97e");
            System.out.println("kaina viso: " + Math.round((double) zvakes * 0.97 * 100) / 100.0 + "e");
        } else {
            System.out.println("zvakiu perkama: " + zvakes);
            System.out.println("vienos zvakes kaina: 0.96e");
            System.out.println("kaina viso: " + Math.round((double) zvakes * 0.96 * 100) / 100.0 + "e");
        }

        System.out.println("------------uzd8---------");

        int min6 = 0;
        int max6 = 100;
        int sk1 = (int) (min6 + Math.round(Math.random() * (max6 - min6)));
        int sk2 = (int) (min6 + Math.round(Math.random() * (max6 - min6)));
        int sk3 = (int) (min6 + Math.round(Math.random() * (max6 - min6)));
        System.out.println(sk1 + " " + sk2 + " " + sk3);

        if ((sk1 < 10 || sk1 > 90) && (sk2 < 10 || sk2 > 90) && (sk3 < 10 || 3 > 90)) {
            System.out.println("vidurkio paskaiciuoti negalima");
        } else if (sk1 < 10 || sk1 > 90) {
            System.out.println("vidurkis be: " + sk1 + " yra: " + Math.round((sk2 + sk3) / 2));
        } else if (sk2 < 10 || sk2 > 90) {
            System.out.println("vidurkis be: " + sk2 + " yra: " + Math.round((sk1 + sk3) / 2));
        } else if (sk3 < 10 || 3 > 90) {
            System.out.println("vidurkis be: " + sk3 + " yra: " + Math.round((sk2 + sk3) / 2));
        } else if ((sk1 < 10 || sk1 > 90) && (sk2 < 10 || sk2 > 90)) {
            System.out.printf("vidurkis be " + sk1 + " ir " + sk2 + " yra" + sk3);
        } else if ((sk2 < 10 || sk2 > 90) && (sk3 < 10 || sk3 > 90)) {
            System.out.printf("vidurkis be " + sk2 + " ir " + sk3 + " yra" + sk1);
        } else if ((sk1 < 10 || sk1 > 90) && (sk3 < 10 || sk3 > 90)) {
            System.out.printf("vidurkis be " + sk1 + " ir " + sk3 + " yra " + sk2);
        }

        System.out.println("vidurkis visu skaiciu: " + Math.round((sk1 + sk2 + sk3) / 3));

        System.out.println("-------uzd9---------");
// generuoti random valandas/ minutes / sekundes
        int min7 = 0;
        int max7 = 23;
        int valandos = (int) (min7 + Math.round(Math.random() * (max7 - min7)));
        int min8 = 0;
        int max8 = 59;
        int minutes = (int) (min8 + Math.round(Math.random() * (max8 - min8)));
        int sekundes = (int) (min8 + Math.round(Math.random() * (max8 - min8)));

        String valandos0 = String.format("%02d", valandos);
        String minutes0 = String.format("%02d", minutes);
        String sekundes0 = String.format("%02d", sekundes);

        System.out.println("random time: " + valandos0 + ":" + minutes0 + ":" + sekundes0);

// generuoti psek sekundziu
        int min9 = 0;
        int max9 = 300000000;
        int psek = (int) (min9 + Math.round(Math.random() * (max9 - min9)));
// sekundes / minutes / valandos pridejus psek sekundziu
        int sekundes2 = (sekundes + psek) % 60;
        int minutes2 = (minutes + ((sekundes + psek) / 60)) % 60;
        int valandos2 = (valandos + ((minutes + ((sekundes + psek) / 60)) / 60)) % 24;
// laikas pridejus psek sekundziu
        String valandos02 = String.format("%02d", valandos2);
        String minutes02 = String.format("%02d", minutes2);
        String sekundes02 = String.format("%02d", sekundes2);

        System.out.println("time after " + psek + " seconds: " + valandos02 + ":" + minutes02 + ":" + sekundes02);

// --global user.name "simonaspalt"
 // --global user.email "simaspa@gmail.com"

    }
}