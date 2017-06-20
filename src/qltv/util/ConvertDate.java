/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qltv.util;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ConvertDate {
    // chuyen date tu java -> date sql
    public static java.sql.Date convertDate(Date date){
        if(date != null)
        return new java.sql.Date(date.getTime());
        return null;
    }
    
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // hh:mm
         // lay ra ngya hien tai
        System.out.println(sdf.format(new Date()));
    }
    
    
    
}
