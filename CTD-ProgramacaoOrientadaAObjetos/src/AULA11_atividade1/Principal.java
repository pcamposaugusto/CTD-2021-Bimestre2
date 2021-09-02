package AULA11_atividade1;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente(001, "Paula", "873366363", "839381982-22", "6544-0");

        ContaPoupanca poup = new ContaPoupanca(3000, cliente1, 0.06);
        ContaCorrente cc = new ContaCorrente(500, cliente1, 1000);

        cc.relatarSaldo();
        cc.depositarCheque(150, "Bradesco", LocalDate.of(2021,9,1));
        cc.relatarSaldo();
        cc.sacar(2000);
        cc.sacar(1500);

        poup.sacar(5000);
        poup.sacar(400);
        poup.relatarSaldo();

    }

}
