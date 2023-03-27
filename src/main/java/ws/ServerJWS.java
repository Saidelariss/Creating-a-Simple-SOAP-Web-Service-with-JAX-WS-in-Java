package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        //démarrer un petit serveur http
        //l'adresse 0.0.0.0 rend le service web accessible sur le réseau local via n'importe quelle interface réseau
        Endpoint.publish("http://0.0.0.0:9191/" ,new BanqueService());
        System.out.println("web service déployé sur http://0.0.0.0:9191/");
    }
}
