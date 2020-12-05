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
public interface Publisher {
    public void register(Subscriber subscriber);
    public void unRegister(Subscriber subscriber);
    public void notifySubscribers();
    public void updateGoogleStock(double stock);
    public void updateFbStock(double stock);
}
