package AULA16;

public class Principal {
    public static void main(String[] args) throws ClienteException {
        Cliente cliente1 = new Cliente("Silas", "Medeiros", "1211637", 100);
        try{
            cliente1.comprar(500);
        } catch (ClienteException e){
            System.err.println(e.toString());
        }

    }
}
