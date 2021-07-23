package JavaCore.Lection3.task357;

public class Main {
    public static void main(String[] args) {

    }

public Label checkLabels(TextAnalyzer[] analyzers, String text) {
    Label label;
    for (TextAnalyzer analyzer : analyzers) {
        if((label = analyzer.processText(text)) != Label.OK) {
            return label;
        }
    }
    return Label.OK;
}
}
