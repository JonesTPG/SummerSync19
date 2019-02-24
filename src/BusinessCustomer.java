/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joonas
 */
public class BusinessCustomer extends Customer{
    
    String VAT_id;
    
    public BusinessCustomer(String name, String phone, String email, String VAT_id) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.VAT_id = VAT_id;
     
    }
    
}
