import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub =new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(7600));
        Compte co =stub.getCompte(5);
        System.out.println(co.getCode());
        System.out.println(co.getSolde());
    }
}
