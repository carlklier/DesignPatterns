package Chain_of_Responsibility;

public interface Handler {
    public void setNextHandler(Handler handler);
    public void handle(Problem problem);
}