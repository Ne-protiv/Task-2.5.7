package Task;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    TooLongTextAnalyzer(int limit) {
        this.maxLength = limit;
    }

    public Label processText(String text) {// определяем единственный метод интерфейса
        if (text.length()>maxLength)
            return Label.TOO_LONG;
        else return Label.OK;
    }
}
