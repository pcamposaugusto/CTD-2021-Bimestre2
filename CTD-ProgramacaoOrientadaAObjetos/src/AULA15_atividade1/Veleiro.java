package AULA15_atividade1;

public class Veleiro extends Embarcacao implements Comparable<Veleiro> {

    private int qntdMastros;

    public Veleiro(Capitao capitao, double precoBase, double valorAdicional, int anoFabricacao, double comprimento, int qntdMastros) {
        super(capitao, precoBase, valorAdicional, anoFabricacao, comprimento);
        this.qntdMastros = qntdMastros;
    }

    public int getQntdMastros() {
        return qntdMastros;
    }

    @Override
    public int compareTo(Veleiro veleiro) {
        if(this.qntdMastros == veleiro.getQntdMastros()){
            System.out.println("Esses veleiros são iguais");
            return 0;
        } else if(this.qntdMastros > veleiro.getQntdMastros()){
            System.out.println("Você é um veleiro maior");
            return 1;
        } else{
            System.out.println("Você é um veleiro menor");
            return -1;
        }
    }
}
