package segundoParcial.E3;

public class Client {
    public static void main(String[] args){
        Facebook facebook = new Facebook();
        facebook.suscribir(new Usuario("video"));
        facebook.suscribir(new Usuario("publicacion"));
        facebook.suscribir(new Usuario("video"));
        facebook.suscribir(new Usuario("publicacion"));
        facebook.suscribir(new Usuario("video"));

        facebook.sendNotificacion("video");
        facebook.sendNotificacion("publicacion");
    }
}
