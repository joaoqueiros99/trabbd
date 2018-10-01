
package agencia;

import java.util.ArrayList;


public class AreaConhecimento {
    
    ArrayList<Projeto> projetos = new ArrayList();
    
    public void cadastraProjeto(Projeto projeto){
        projetos.add(projeto);
    }
    
    public String numDeProjetos(){
        return projetos.size() + "";
    }    
    
    public static void listaProjeto(){
        
        
    }
    public void excluirProjeto(){
        
        
    }
}
