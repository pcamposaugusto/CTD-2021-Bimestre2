package AULA12;

public class Principal {
    public static void main(String[] args){
        Empresa dh = new Empresa("DH", "68525");
        Funcionario funcionario1 = new Gerente("José", "Silva", "555", "josesilva@gmail.com","234", 10000, 500);

        dh.cadastrar(funcionario1);
        dh.listar();
        dh.remover(funcionario1);
        dh.listar();

    }
}
