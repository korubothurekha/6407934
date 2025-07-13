//Main.java – Test the Command Pattern


public class Main {
    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn light ON
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn light OFF
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
