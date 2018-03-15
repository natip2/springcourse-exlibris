package personal.mail;

public class AlarmClockImpl implements AlarmClock{


    private final Alarm alarm;
    private final Clock clock;

    @Override
    public void stop() {
        System.out.println("in alarm clock impl stop");

        this.alarm.stop();
    }

    @Override
    public void mute() {
        System.out.println("in alarm clock impl mute");
        this.clock.mute();
    }

    public AlarmClockImpl(Alarm alarm,Clock clock) {
        this.alarm =alarm;
        this.clock=clock;
    }

    @Override
    public int getTime() {
        System.out.println("in alarm clock impl getTime");

        return (this.alarm.getTime()+this.clock.getTime())/2;
    }
}
