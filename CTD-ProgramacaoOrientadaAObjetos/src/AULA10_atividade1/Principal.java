package AULA10_atividade1;

public class Principal {
    public static void main(String[] args){
        Associado associado = new Associado("123", "Yana", 99, "Musculação");
        AssociadoHabilitado associadoHabilitado = new AssociadoHabilitado("345", "JP","Dança", 99, 25);
        associadoHabilitado.setHabilitado(true);

        System.out.println(associado.custoMensal());
        System.out.println(associadoHabilitado.custoMensal());

    }
}
