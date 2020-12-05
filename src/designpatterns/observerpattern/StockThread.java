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
public class StockThread implements Runnable{

    public Publisher publisher;
    private String company;
    private double value;
    public StockThread(Publisher publisher, String company, double value) {
        this.publisher = publisher;
        this.company = company;
        this.value = value;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(3000);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            
            value += 0.3;
            
            if (company == "google") ((StockPublisher) publisher).updateGoogleStock(value);
            if (company == "fb") ((StockPublisher) publisher).updateFbStock(value);
        }
    }
    
}
