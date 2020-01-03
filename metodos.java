
package debercorreo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class metodos {

    public void entrada() {
        boolean retorno = false;
        int validacion = 0;     

        do {
            String email = (String) JOptionPane.showInputDialog(null, ("INGRESE SU CORREO ELECTRONICO"));
            String valida1 = email, valida2 = email;

            int conta1 = 0, valor = 3, conta2 = 0;
            for (int i = 0; i < valida1.length(); i++) {

                conta1++;
                // verificador uno
            }
            if (conta1 >= valor) {
                validacion = 1;                
            }
            if (validacion == 0) {
                JOptionPane.showMessageDialog(null, "Debe tener mas de tres caracteres   " + email);
                retorno = false;
            } else {
                if (conta1 < valor) {
                    validacion = 0;
                }
            }

            // verificador dos
            for (int i = 0; i < valida1.length(); i++) {
                if ((valida1.charAt(i) == '@') || (valida1.charAt(i) == '.')) {
                    conta2++;
                    if (conta2 == 2) {
                        validacion = validacion + 1;
                    } else {
                        if (conta2 == 1) {
                            validacion = validacion + 1;

                        }
                    }
                }
            }

            //VERIFICADOR TRES
            boolean status = false;
            String emailRegex = "^[+A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
            Pattern emailPatt = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);
            Matcher matcher = emailPatt.matcher(email);

            if (matcher.matches()) {
                status = true;

                validacion = validacion + 1;

            } else {
                status = false;

            }
            if (validacion == 4) {
                JOptionPane.showMessageDialog(null, "¡Si es correo! : " + email);
                retorno = true;

            }
            if (validacion == 1) {
                JOptionPane.showMessageDialog(null, "¡No es un correo valido!  ejemplo@gmail.com ");

            }
            if (validacion == 2) {
                JOptionPane.showMessageDialog(null, "¡No es un correo valido!  ejemplo@gmail.com ");

            }
            if (validacion == 3) {
                JOptionPane.showMessageDialog(null, "¡No es un correo valido!  ejemplo@gmail.com ");
            }

        } while (!retorno);

    }

}       
    

       
    
     
    
   
    

       
  
   
   