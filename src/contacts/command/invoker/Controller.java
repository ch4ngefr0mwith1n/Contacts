package contacts.command.invoker;

import contacts.command.Command;

// ovo će da bude "Invoker" klasa:
public class Controller {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
