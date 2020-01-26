
package nullpattern;

import javax.swing.JOptionPane;


public class NullPattern {
        public static void main(String[] args) {
        createObject c=new createObject();
        c.d.display();
    }
    
}
   
     interface display{
         public void display();
     }
     
     class Console implements display{

        @Override
        public void display() {
            System.out.println("Display by Console ... ");

        }
         
     }
      class nullObject implements display{

        @Override
        public void display() {

        }
         
     }
    
      class Gui implements display{

        @Override
        public void display() {
           JOptionPane.showMessageDialog(null,"Display by GUI .... ");
        }
         
     }
      class createObject{
          display d;
          public createObject(){
              this.d=new nullObject();
          }
          public createObject(display d){
               this.d=d;
          } 
      }

