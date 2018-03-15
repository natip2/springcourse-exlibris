package personal.mail;

public class ClockImpl implements Clock {
    @java.lang.Override
    public void mute() {
        System.out.println("mute");
    }

    @java.lang.Override
    public int getTime() {
        System.out.println("get time clock impl");
        return 0;
    }
}
