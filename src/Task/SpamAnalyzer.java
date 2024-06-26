package Task;

public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    SpamAnalyzer(String[] words) {
        this.keywords = words;
    }
    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
    @Override
    protected String[] getKeywords(){
        return keywords;
    }
}
