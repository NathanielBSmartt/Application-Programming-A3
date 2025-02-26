package translate;

import tag.*;
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
        int currIndex = 0;

        while (scan.hasNextLine()) {
            currLine = scan.nextLine();
            Translation t = new Translation(currLine, Translate(currLine));
            add(t);

        }
    }

    public String Translate(String tag) {
        return "";
    }
}
