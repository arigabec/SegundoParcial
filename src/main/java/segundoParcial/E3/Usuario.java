package segundoParcial.E3;

public class Usuario implements IUser {
    private String tipoNotificacion;

    public Usuario(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    @Override
    public void update(String msg) {
        System.out.println("El usuario tiene una notificacion de tipo > " + tipoNotificacion);
        System.out.println("Notificacion > " + msg);
    }
}
