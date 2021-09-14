package AULA15_atividade1;

public class Iate extends Embarcacao implements Comparable<Iate> {

    private int qntdCabines;

    public Iate(Capitao capitao, double precoBase, double valorAdicional, int anoFabricacao, double comprimento, int qntdCabines) {
        super(capitao, precoBase, valorAdicional, anoFabricacao, comprimento);
        this.qntdCabines = qntdCabines;
    }

    public int getQntdCabines() {
        return qntdCabines;
    }

    @Override
    public int compareTo(Iate iate) {
        if(this.qntdCabines == iate.getQntdCabines()){
            System.out.println("Os iates são iguais");
            return 0;
        } else if(this.qntdCabines > iate.getQntdCabines()){
            System.out.println("Você é mais luxuoso e rycooo");
            return 1;
        } else{
            System.out.println("Você é pobrinho");
            return -1;
        }
    }
}
