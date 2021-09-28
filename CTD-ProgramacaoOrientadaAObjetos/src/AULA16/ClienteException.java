package AULA16;

public class ClienteException extends Exception{

    public ClienteException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "A seguinte exceção ocorreu: " + getClass().getName() + "\n Mensagem: " + getMessage();
    }

}
