/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Date;

/**
 *
 * @author student-311
 */
public class CDs {
   public class CD extends Items{
         private Boolean requested;
        public CD(String Title, String Author_Artist, int Itemid, 
            Boolean Onloan, Date Duedate,Boolean requested){
            super(Title,Author_Artist,Itemid,Onloan,Duedate);
            this.requested = requested;
        }

     public void printDetails(){
         super.printDetails();
         if(requested){
                System.out.println("You can't have it now.");
         }
         else{
             System.out.println("You can have it now.");
         }
     }}}

