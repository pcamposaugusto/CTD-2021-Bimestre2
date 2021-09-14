package AULA15_atividade1;

public class Principal {
    public static void main(String[] args) {
        Capitao cap1 = new Capitao("Esther Pimentel", 123);
        Iate iate1 = new Iate(cap1, 1100, 200,2011, 30, 3);
        Iate iate2 = new Iate(cap1, 34000, 5000, 2021, 280, 24);

        iate1.compareTo(iate2);
        iate2.compareTo(iate1);

        Veleiro veleiro1 = new Veleiro(cap1, 5000, 150, 2021, 15, 4);
        Veleiro veleiro2 = new Veleiro(cap1, 10000, 2000, 2020, 20, 12);

        System.out.println(veleiro1.calcAluguel());
        System.out.println(iate2.calcAluguel());

        veleiro2.compareTo(veleiro1);

    }
}
