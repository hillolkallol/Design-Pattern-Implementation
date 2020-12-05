/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observerpattern;

/**
 *
 * @author KD
 */
public class StockSubscriber implements Subscriber {

    public int id;
    private double googleStock;
    private double fbStock;
    public Publisher publisher;
    
    public StockSubscriber (Publisher publisher) {
        this.publisher = publisher;
    }
    
    @Override
    public void update(double googleStock, double fbStock) {
        this.googleStock = googleStock;
        this.fbStock = fbStock;
        
        System.out.println("New Stock Price: Google > " + googleStock + ", Facebook > " + fbStock);
    }
    
}
