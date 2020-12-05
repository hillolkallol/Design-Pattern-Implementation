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
public class UpdateStock {
    
    public static void main(String[] args) {
        StockPublisher publisher = new StockPublisher();
        Subscriber subscriber = new StockSubscriber(publisher);
        publisher.register(subscriber);
        publisher.updateGoogleStock(1022.22);
        publisher.updateFbStock(282.12);
        
        Runnable google = new StockThread(publisher, "google", 1022.22);
        Runnable fb = new StockThread(publisher, "fb", 282.12);
        
        Thread thread1 = new Thread(google);
        Thread thread2 = new Thread(fb);
        
        thread1.start();
        thread2.start();
    }
}
