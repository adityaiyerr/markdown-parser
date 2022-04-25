//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            int openBracket = markdown.indexOf("[", currentIndex);
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
            // Error Fix Made by Davit Margarian
            // URL padding fix
            /*String url = markdown.substring(openParen + 1, closeParen);
            url = url.replaceAll("^\s*", "");
            url = url.replaceAll("\s*$", "");*/

            toReturn.add(url);
            currentIndex = closeParen + 1;
            // Error Fix Made by Ravi Shende
            //handle errors with empty lines at the end
            if(markdown.indexOf("[", currentIndex) == -1){
                break;
            }
        }
        return toReturn;
    }


    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        // Error Fix Made by Leo Hu
        if (content.contains("(") == true && content.contains("(") == true) {
            ArrayList<String> links = getLinks(content);
                System.out.println(links);
        }
    }
}
