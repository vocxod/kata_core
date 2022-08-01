package ru.odybo.universal;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;

public class Task_2_4_18 {

    // for colored text
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String[] aRoles = {"Городничий", "Аммос Федорович",
            "Артемий Филиппович", "Лука Лукич"};
    public static final String[] aTextLines = { "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
    "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?",
    "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
    "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!",
    "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

    /*
    Samle result
    Городничий:
    1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
    4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.

    Аммос Федорович:
    2) Как ревизор?
    5) Вот те на!

    Артемий Филиппович:
    3) Как ревизор?
    6) Вот не было заботы, так подай!

    Лука Лукич:
    7) Господи боже! еще и с секретным предписаньем!
    * */

    public static String printTextPerRoleRegExp(String[] roles, String[] textLines) {
        String sResult;
        ArrayList<String> numeratedLines = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int numLine = 1;

        // prepare data from textLines
        String sReplika;
        for (String sayLine: textLines) {
            sReplika = numLine + ":" + sayLine;
            numeratedLines.add(sReplika.trim());
            numLine++;
        }
        Pattern pattern;
        Matcher matcher;
        boolean matchFound;
        for(String sRole: aRoles){
            // line number:role:role_text
            // System.out.println(sRole + ":");
            sb.append(sRole + ":" + "\n");
            pattern  = Pattern.compile("([0-9]+):(" + sRole + "):(.*)");
            for(String sTextLime: numeratedLines){
                matcher = pattern.matcher(sTextLime);
                if(matcher.find()){
                    //System.out.print(ANSI_YELLOW + sTextLime + ANSI_RESET);
                    if (matcher.groupCount() == 3) {
                        // System.out.print(matcher.group(1) + ")" + matcher.group(3));
                        sb.append(matcher.group(1) + ")" + matcher.group(3) + "\n");
                    }
                    // System.out.print("\n");
                    // sb.append("\n");
                }
            }
            // delimiter role
            sb.append("\n");
        }
        sResult = sb.toString();
        return sResult;
    }


    public static String printTextPerRole(String[] roles, String[] textLines) {
        String sResult;
        StringBuilder sb = new StringBuilder();
        int numLine = 1;

        for(String sRole: aRoles){
            // line number:role:role_text
            sb.append(sRole + ":" + "\n");
            for (int jj = 0; jj < textLines.length; jj++) {
                if (textLines[jj].contains(sRole + ":")) {
                    numLine = jj + 1;
                    sb.append(numLine + ")" + textLines[jj].substring(sRole
                            .length()+1).trim() + "\n");
                }
            }
            sb.append("\n");
        }
        sResult = sb.toString();
        return sResult;
    }


    public static void main(String[] args) {
        String sResult;
        sResult = printTextPerRole(aRoles, aTextLines);
        System.out.print(sResult);
    }

}
