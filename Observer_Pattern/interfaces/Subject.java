package Observer_Pattern.interfaces;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyAllObservers();
}
