package com.globallogic.interfaces;

import com.globallogic.interfaces.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
