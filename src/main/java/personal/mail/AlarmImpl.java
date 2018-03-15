package personal.mail;

public class AlarmImpl implements Alarm {
    @Override
    public void stop() {
        System.out.println("Alarm Stop");
    }

    @Override
    public int getTime() {
        System.out.println("Alarm get time");
        return 0;
    }
}
