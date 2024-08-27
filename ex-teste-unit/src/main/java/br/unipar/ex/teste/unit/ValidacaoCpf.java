package br.unipar.ex.teste.unit;


public class ValidacaoCpf {
    
    public boolean validarCPF(String cpf){
        if(cpf.length() != 11){
            return false;
        }
        if(cpf.isBlank()){
            return false;
        }
        if(cpf.isEmpty()){
            return false;
        }
        else{
            return true;
        }
        
    }
}
