import java.time.LocalDateTime;

public class EventTask extends Task {
    private LocalDateTime from;
    private LocalDateTime to;

    public EventTask(String name, LocalDateTime from, LocalDateTime to) {
        super(name);
        this.from = from;
        this.to = to;
    }

    @Override
    public String getDescription() {
        return "[E]" + super.getDescription() + " (from: " + from.format(super.getDateOutputFormat()) + " to: " + to.format(super.getDateOutputFormat()) + ")";
    }

    @Override
    public String toFileString() {
        return "E | " + super.toFileString() + " | " + from.format(super.getDateOutputFormat()) + " | " + to.format(super.getDateOutputFormat());
    }

    @Override
    public String toString() {
        return super.toString() + " | " + from.format(super.getDateOutputFormat()) + " | " + to.format(super.getDateOutputFormat());
    }
}
