package Command;

public class UberEatsApp {
    Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void order(){
        if(command != null){
            command.execute();
        } else {
            System.out.println("You need to set a command (select an item) before you can order.");
        }
       
    }
}