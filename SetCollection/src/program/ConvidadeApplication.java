package program;

import entities.ConjuntoConvidados;

public class ConvidadeApplication {
    
    public static void main(String[] args) {

        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Gabriel", 1);
        convidados.adicionarConvidado("Leonardo", 2);
        convidados.adicionarConvidado("Bruno", 3);

        Integer quantidadeTotalConvidados = convidados.contarConvidados();
        
        convidados.exibirConvidados();
        System.out.println(quantidadeTotalConvidados);

        convidados.removerConvidadoPorCodigoConvite(1);

        System.out.println("-------------------------");
        
        quantidadeTotalConvidados = convidados.contarConvidados();

        convidados.exibirConvidados();

        System.out.println("-------------------------");

        System.out.println(quantidadeTotalConvidados);


    }
}
