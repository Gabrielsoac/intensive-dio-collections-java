package entities;

import java.util.HashSet;
import java.util.Set;

import exceptions.ConvidadoNotExistException;
import exceptions.ConvidadosListEmptyException;

public class ConjuntoConvidados {
    
    private Set<Convidado> convidados;

    public ConjuntoConvidados(){
        this.convidados = new HashSet<Convidado>();
    }

    public void adicionarConvidado(String nome, int condigoConvite){
        convidados.add(new Convidado(nome, condigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvidado){

        Convidado convidadoParaRemover = null;

        for (Convidado convidado : convidados){
            if(convidado.getCodigoConvite() == codigoConvidado){
                convidadoParaRemover = convidado;
            }
        }
        if(convidadoParaRemover != null){
            convidados.remove(convidadoParaRemover);
        } else {
            throw new ConvidadoNotExistException("Não há um canditado na lista com este código para remover");
        }       
    }

    public Integer contarConvidados(){
        if(convidados.isEmpty()){
            return 0;
        }
        return convidados.size();
    }
    public void exibirConvidados(){

        if(convidados.isEmpty()){
            throw new ConvidadosListEmptyException("Não há candidados para exibir");
        }

        for (Convidado convidado : convidados){
            System.out.println(convidado);
        }
    }


    

}
