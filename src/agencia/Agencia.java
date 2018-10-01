
package agencia;

import java.util.ArrayList;


public class Agencia {

    public static void main(String[] args) {
        ArrayList<Projeto> projetos = new ArrayList();
        
        Projeto projeto = new Projeto("p01", "sistemas", "um dia", "100", "UNA");
        
        projetos.add(projeto);

        
        
        for (Projeto p : projetos){
            System.out.println(p);
        }
    }
    
}
