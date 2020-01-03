/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debercorreo;

import javax.swing.JOptionPane;

/**
 *
 * @author pc-4
 */
public class main {
    public static void main(String[] args)throws java.lang.NullPointerException{
       try{
        metodos uno = new metodos();       
                uno.entrada();
        
     
       }catch (NullPointerException t){
           JOptionPane.showMessageDialog(null, "REGRESE PRONTO");
       }
      
        
    }
    
}
       

    
