package AULA6;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
////        Date data = new Date();
////        Impressora impressora = new Impressora("epson", "wifi", data);
//        Impressora impressora = new Impressora("epson", "wifi", LocalDate.of(2021,8,20));
//        System.out.println(impressora.getDataFabricacao());
//
//        impressora.setFolhasDisponiveis(100);
//        impressora.imprimir("Olá, mundo!");
//        System.out.println(impressora.getFolhasDisponiveis());


        Cachorro lupi = new Cachorro("lupi", "SRD", 2020, 5.6, true, false);
        System.out.println(lupi.encaminharParaAdocao());

    }



}
