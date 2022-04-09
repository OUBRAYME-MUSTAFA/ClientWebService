import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService subtWS = new BanqueWS().getBanqueServicePort();
        System.out.println("conversion de montant 800 est "+subtWS.conversionEuroToDH(800));
        Compte cp = subtWS.getComtpe(2L);
        System.out.println("Compte_code = "+cp.getCode()+" | compte_sole = "+cp.getSolde());
        List<Compte> cptes = subtWS.compteList();
        System.out.println("liste des Comptes :");
        cptes.forEach(c->{
            System.out.println("***********************************************************");
            System.out.println("Compte_code = "+c.getCode()+" | compte_sole = "+c.getSolde());

        });







    }
}
