import java.sql.Time;

public abstract class Mediator {
    IWidget widget;

    public Mediator(IWidget widget) {
        this.widget = widget;
    }

    public abstract void Notify();
}