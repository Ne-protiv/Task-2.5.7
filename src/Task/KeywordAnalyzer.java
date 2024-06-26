package Task;

abstract public class KeywordAnalyzer implements TextAnalyzer {
    public Label processText(String text) {// определяем единственный метод интерфейса
        StringBuilder analizingText = new StringBuilder(text);
        TextAnalyzer[] parametrs = {new NegativeTextAnalyzer(), new SpamAnalyzer(getKeywords())};
        // массив обьектов на основе этого интерфейса
        for (int i = 0; i < parametrs.length; i++) {//перебор критериев оценки текста
            for (String findingWords : getKeywords()) {//перебор ключевых слов для этих критериев
                if (analizingText.indexOf(findingWords) != -1) {//проверка на наличие совпадений
                    return getLabel();
                }
            }
        }
        return Label.OK;
    }

    protected abstract Label getLabel();//добавляем два абстрактных метода для дальнейшей реализации классов SpamAnalyzer  и NegativeTextAnalyzer

    protected abstract String[] getKeywords();

}

