package JavaCore.Lection7.FinalTask7213;

public class MailMessage implements Sendable<String> {
    private final String from;
    private final String to;
    private final String content;

    public MailMessage(String from, String to, String content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }
}
