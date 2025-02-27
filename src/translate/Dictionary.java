package translate;

import tag.TagOccurrence;
import java.util.*;
import java.io.*;

public class Dictionary {
    private ArrayList<Translation> translations;

    public Dictionary() {
        translations = new ArrayList<Translation>();
    }

    public void add(Translation t) {
        translations.add(t);
    }

    public void addTranslations(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scan = new Scanner(file);
        String currLine;

        while (scan.hasNextLine()) {
            currLine = scan.nextLine();
            Translation t = new Translation(TagOccurrence.nextOccurrence(currLine, 0).getTag(), currLine.substring(currLine.indexOf('"') + 1, currLine.length() - 1));
            add(t);

        }
        scan.close();
    }

    public String Translate(String tag) {

        //Take a string tag and look through the dictionary for a translation and return it

        for (Translation t : translations) {
            if (t.getSource().equals(tag)) {
                return t.getTarget();
            }
        }

        return tag;
    }
}
