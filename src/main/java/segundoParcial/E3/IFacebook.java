package segundoParcial.E3;

public interface IFacebook {
    void suscribir(Usuario observer);

    void detach(Usuario observer);

    void notifyObservers(String msg, String tipo);
}
