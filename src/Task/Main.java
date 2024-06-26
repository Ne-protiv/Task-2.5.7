package Task;

public class Main {
    private static int maxLenght = 100;
    private static String[] spam = {"лол", "кек"};

    public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            if (analyzer.processText(text) != Label.OK) {
                return analyzer.processText(text);
            }
        }
        return Label.OK;
    }

    public static void main(String[] args) {
        String text = "лолкек:(";
        TextAnalyzer[] parametrs = {
                new NegativeTextAnalyzer(),
                new SpamAnalyzer(spam),
                new TooLongTextAnalyzer(maxLenght),
        };
        System.out.println(checkLabels(parametrs,text));
    }
}
