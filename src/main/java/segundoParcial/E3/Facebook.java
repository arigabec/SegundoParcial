package segundoParcial.E3;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements IFacebook {
    private List<IUser> observers = new ArrayList<>();

    public Facebook(){}

    public void sendNotificacion(String tipo){

    }

    @Override
    public void suscribir(IUser observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IUser observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String msg) {
        for (IUser obs : observers) {
            obs.update("Info > " + msg);
        }
    }
}
