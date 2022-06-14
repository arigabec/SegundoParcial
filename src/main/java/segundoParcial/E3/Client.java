package segundoParcial.E3;

public class Client {
    public static void main(String[] args){
        Facebook facebook = new Facebook();
        facebook.suscribir(new Usuario("video"));
        facebook.suscribir(new Usuario("publicacion"));
        facebook.suscribir(new Usuario("video"));
        facebook.suscribir(new Usuario("publicacion"));
        facebook.suscribir(new Usuario("video"));

        facebook.sendNotificacion("video", "Nuevo video añadido a su perfil");
        facebook.sendNotificacion("publicacion", "Nueva publicacion realizada");
        facebook.sendNotificacion("publicacion", "Su publicacion infringe las normas de Facebook");
    }
}
