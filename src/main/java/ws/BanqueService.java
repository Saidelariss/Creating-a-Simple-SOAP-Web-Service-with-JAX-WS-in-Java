package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//un exemple simple d'un web service soap en utilisant la spécification jaxWS
@WebService(serviceName = "BanqueWS") // cette classe est un web service
public class BanqueService {

    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name= "montant") double mt){
        return mt*10;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name= "code") int code){
        return new Compte(code, Math.random()*100,new Date());
    }


    @WebMethod
    public List<Compte> listCompte(){
        return List.of(
                new Compte(1, Math.random()*100,new Date()),
                new Compte(2, Math.random()*100,new Date()),
                new Compte(3, Math.random()*100,new Date())
        );
    }
}
