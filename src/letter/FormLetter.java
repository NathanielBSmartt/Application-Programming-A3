package letter;
import translate.Dictionary;

import javax.swing.text.html.HTML.Tag;

import tag.*;

public class FormLetter {
    private String templatePath;
    private Dictionary dictionary;

    public void FormLetter(String teplatePath) {
        this.templatePath = teplatePath;
        this.dictionary = new Dictionary();
    }

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public String translateLine(String line) {
        return "";
    }

    public void generate(String outputFilePath) {

    }
}
