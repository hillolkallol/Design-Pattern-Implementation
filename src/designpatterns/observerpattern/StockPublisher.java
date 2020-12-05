/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.observerpattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author KD
 */
public class StockPublisher implements Publisher {

    public Set<Subscriber> subscribers;
    private double googleStock;
    private double fbStock;
    
    public StockPublisher () {
        subscribers = new HashSet<>();
    }
    
    @Override
    public void register(Subscriber subscriber) {
        subscribers.add (subscriber);
        System.out.println("Adding new subscriber..");
    }

    @Override
    public void unRegister(Subscriber subscriber) {
        System.out.println("Deleing new subscriber..");
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber s: subscribers) {
            s.update(googleStock, fbStock);
        }
    }
    
    @Override
    public void updateGoogleStock (double stock) {
        this.googleStock = stock;
        notifySubscribers();
    }
    
    @Override
    public void updateFbStock (double stock) {
        this.fbStock = stock;
        notifySubscribers();
    }
}
