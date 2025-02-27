import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.text.html.HTML.Tag;

import letter.FormLetter;
import translate.*;
import letter.*;
import tag.*;

class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Find the next tag occurrence in a string starting from a given index

        // TagOccurrence t = TagOccurrence.nextOccurrence("abc def <tag2><tag3> xyz",
        // 0);

        // TagOccurrence t = TagOccurrence.nextOccurrence("<tag1> abc def <tag2><tag3>
        // xyz", 6);
        // TagOccurrence t = TagOccurrence.nextOccurrence("<tag1> abc def <tag2><tag3>
        // xyz", 28);
        // TagOccurrence t = TagOccurrence.nextOccurrence("<tag1> abc def <<tag2> xyz",
        // 9);
        // TagOccurrence t = TagOccurrence.nextOccurrence(" abc def xyz", 0);
        // TagOccurrence t = TagOccurrence.nextOccurrence("<tag1> abc def <tag2 xy>z",
        // 6);

        Dictionary d = new Dictionary();
        d.addTranslations("translations.txt");
        FormLetter f = new FormLetter("template.txt");
        f.setDictionary(d);
        f.generate("output.txt");

    }

}