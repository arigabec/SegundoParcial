package segundoParcial.E3;

public interface IFacebook {
    void suscribir(IUser observer);

    void detach(IUser observer);

    void notifyObservers(String msg);
}
