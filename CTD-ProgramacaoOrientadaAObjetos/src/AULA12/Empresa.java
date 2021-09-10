package AULA12;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> listaFuncionario = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void cadastrar(Funcionario funcionario){
        listaFuncionario.add(funcionario); // (2, funcionario)
        System.out.println("O funcionário foi cadastrado com sucesso!!");
    }

    public void listar(){
        for(int i = 0; i < listaFuncionario.size(); i++){
            System.out.println(listaFuncionario.get(i));
        }
    }

    public void remover(Funcionario funcionario){
        System.out.println(listaFuncionario.remove(funcionario));
        System.out.println("Funcionário " + funcionario.getNome() + " foi removido com sucesso!!");
    }

}
