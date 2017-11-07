/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava2;

import javax.swing.JOptionPane;
/*******************************************************************************
 **Alejandro yavara Vargas
 
 * Fecha:  Noviembre 06 de 2017
 * Programa:Contraseña
 * Responsabilidad: Clase Principal
 
 * @author LAB01
 *****************************************************************************/
 
public class Contraseña 
{
    public static void main(String[] args)
    {
      
      int clave=212; 
      int cont =0 ;
      int contra=0;
      int cont2=0;
      while (cont<3 && cont2==0)      
      
         if (clave==contra)
         {
            JOptionPane.showMessageDialog(null,"Bienvenido");
            cont2++;
         }
        
         else
          {
          
	contra=Integer.parseInt(JOptionPane.showInputDialog("Ingrese clave"));				
       cont++;
       
       if(cont==3)
       {
         JOptionPane.showMessageDialog(null,"Cuenta bloqueada comuniquese con soporte tecnico");
       }
	       
          
      }
      
          
      }
               
        
    }