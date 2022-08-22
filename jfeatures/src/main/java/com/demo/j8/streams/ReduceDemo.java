package com.demo.j8.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ReduceDemo {
    
    public static void main(String[] args)  {
        
        List<Invoice> invoices = List.of(
            new Invoice("A01", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
            new Invoice("A02", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
            new Invoice("A03", BigDecimal.valueOf(4.99), BigDecimal.valueOf(2))
        );

        BigDecimal sum = invoices.stream()
                .map(invoice -> invoice.getQty().multiply(invoice.getPrice()))    // map to a stream of BigDecimal
                .reduce(BigDecimal.ZERO, (x,y) -> x.add(y) );      // reduce

        System.out.println(sum);    // 49.955
        // System.out.println(sum.setScale(2, RoundingMode.HALF_UP));


    }


}


class Invoice {

    String invoiceNo;
    BigDecimal price;
    BigDecimal qty;

    Invoice(String invoiceNo,    BigDecimal price,    BigDecimal qty){
        this.invoiceNo = invoiceNo;
        this.price = price;
        this.qty = qty;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    // getters, stters n constructor
}