package letter;

import translate.Dictionary;
import java.util.*;
import java.io.*;

import tag.*;

/**
 * FormLetter holds the dictionary and template for the creation of a form
 * letter.
 * 
 * @author Nathaniel Bucknor-Smartt
 * 
 */

public class FormLetter {
    private String templatePath;
    private Dictionary dictionary;

    /**
     * Creates a form letter from a template file
     * 
     * @param templatePath The path to the template for the form letter
     */

    public FormLetter(String templatePath) {
        this.templatePath = templatePath;
        this.dictionary = new Dictionary();
    }

    /**
     * Sets the dictionary for the form letter
     * 
     * @param dictionary The dictionary for the form letter
     */

    public void setDictionary(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    /**
     * Translates a line of text using the dictionary
     * 
     * @param line The line to be translated
     * @return translated line given the dictionary provided to the form letter
     */

    public String translateLine(String line) {
        StringBuilder sb = new StringBuilder();
        int curr = 0;
        TagOccurrence tag = TagOccurrence.nextOccurrence(line, curr);

        while (tag != null) {
            sb.append(line.substring(curr, tag.getBeginIndex()));
            sb.append(dictionary.Translate(tag.getTag()));
            curr = tag.getEndIndex() + 1;
            tag = TagOccurrence.nextOccurrence(line, curr);
        }
        sb.append(line.substring(curr));
        System.out.println(sb.toString());
        return sb.toString();
    }

    /**
     * Generates a form letter given the template and dictionary and outputs it to
     * an output file
     * 
     * @param outputFilePath The path to the output file
     * @throws FileNotFoundException
     * @throws IOException
     */

    public void generate(String outputFilePath) throws FileNotFoundException, IOException {
        FileWriter file = new FileWriter(outputFilePath);
        Scanner scan = new Scanner(new File(templatePath));
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            file.append(translateLine(line));
            file.append("\n");
        }
        scan.close();
        file.close();

    }

}
