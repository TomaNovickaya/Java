//5. Инверсия зависимости. Такой дизайн позволяет Button управлять любым устройством, готовым реализовать интерфейс ButtonServer. Это обеспечивает высокую гибкость, а также означает, что объекты Button смогут управлять еще не изобретенными объектами.

public class Button {
    
    private ButtonServer buttonServer;

    public void poll() {
        if (/* какое-то условие */)
            buttonServer.turnOn();
    }
}

 interface ButtonServer {
    
    void turnOn();

    void turnOff();
}

 class Lamp implements ButtonServer {

    @Override
    public void turnOn() {
        /* ... */
    }

    @Override
    public void turnOff() {
        /* ... */
    }
}
