package segundoParcial.E3;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements IFacebook {
    private List<Usuario> observers = new ArrayList<>();

    public Facebook(){}

    public void sendNotificacion(String tipo, String msg){
        this.notifyObservers(msg, tipo);
    }

    @Override
    public void suscribir(Usuario observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Usuario observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String msg, String tipo) {
        if(tipo.equals("video")){
            for (Usuario u:observers) {
                if(u.getTipoNotificacion().equals("video")){
                    u.update(msg);
                }
            }
        } else if (tipo.equals("publicacion")){
            for (Usuario u:observers) {
                if(u.getTipoNotificacion().equals("publicacion")){
                    u.update(msg);
                }
            }
        }
    }
}
