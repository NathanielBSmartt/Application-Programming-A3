package translate;

import tag.TagOccurrence;
import java.util.*;
import java.io.*;

/**
 * Dictionary class holds a list of translations from tags to words
 * 
 * @author Nathaniel Bucknor-Smartt
 */

public class Dictionary {
    private ArrayList<Translation> translations;

    /**
     * Dictionary constructor holds a list of translations
     */
    public Dictionary() {
        translations = new ArrayList<Translation>();
    }

    /**
     * Add a translation to the dictionary
     * 
     * @param t the translation in form of <TAG> "Word"
     */

    public void add(Translation t) {
        translations.add(t);
    }

    /**
     * Add translations from a file with the format <TAG> "Word"
     * 
     * @param filePath the path to the translations file
     * @throws FileNotFoundException
     */

    public void addTranslations(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scan = new Scanner(file);
        String currLine;

        while (scan.hasNextLine()) {
            currLine = scan.nextLine();
            Translation t = new Translation(TagOccurrence.nextOccurrence(currLine, 0).getTag(),
                    currLine.substring(currLine.indexOf('"') + 1, currLine.length() - 1));
            add(t);

        }
        scan.close();
    }

    /**
     * Translate a tag to a word
     * 
     * @param tag the tag string
     * @return the tag translated
     */

    public String Translate(String tag) {

        // Take a string tag and look through the dictionary for a translation and
        // return it

        for (Translation t : translations) {
            if (t.getSource().equals(tag)) {
                return t.getTarget();
            }
        }

        return tag;
    }
}
