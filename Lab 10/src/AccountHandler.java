public class AccountHandler {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    private void executeCommand(){
        command.execute();
    }
}
