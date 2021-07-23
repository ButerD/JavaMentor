package JavaCore.Lection3.task357;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        return maxLength < text.length() ? Label.TOO_LONG : Label.OK;
    }
}
