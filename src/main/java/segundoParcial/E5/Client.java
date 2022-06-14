package segundoParcial.E5;


public class Client {
    public static void main(String[] args) throws InterruptedException {
        Celular celular = new Celular();
        celular.setState(new Reiniciar());
        celular.request();

        celular.setState(new Apagado());
        celular.request();

        celular.setState(new Prendido());
        celular.request();
    }
}
