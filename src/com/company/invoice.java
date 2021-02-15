package com.company;

import javax.xml.namespace.QName;

public class invoice {

    private String invoice_name;
    private String description;
    private int item_quantity;
    private double invoice_amount;

    public invoice(String invoice_name , String description , int item_quantity, double invoice_amount){
        this.invoice_name = invoice_name;
        this.description = description;
     if(item_quantity>0){
        this.item_quantity = item_quantity;}
     else {this.item_quantity=0;
     }
     if(invoice_amount>0){
        this.invoice_amount = invoice_amount;}
     else {
         this.invoice_amount=0;
     }
    }

    public void setInvoice_name(String invoice_name){
        this.invoice_name = invoice_name;
    }
    public String getInvoice_name(){
        return invoice_name;
    }

    public void setDescription(String description){
        this.description = description;
    }
    public String getRecurring(){
        return description;
    }

    public void setItem_quantity(int item_quantity){
        if(item_quantity>0) {
            this.item_quantity = item_quantity;
        }
        else {
            this.item_quantity=0;
        }
    }
    public int getItem_quantity(){
        return item_quantity;
    }

    public void setInvoice_amount(double invoice_amount){
        if(invoice_amount>0){
            this.invoice_amount = invoice_amount;}
        else {
            this.invoice_amount=0.0;
        }
    }
    public double getInvoice_amount(){
        return invoice_amount * item_quantity;
    }


}
