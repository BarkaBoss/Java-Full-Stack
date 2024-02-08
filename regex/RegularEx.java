package regex;

import java.util.regex.Pattern;

public class RegularEx {

    // ^ starts with
    //\d or [0-9] any number
    //[a-z] any lowercase char
    //[a-zA-Z] any lowercase or uppercase char
    //[a-zA-Z0-9] any alphanumeric char
    // | optional
    //() grouping
    //* zero or more
    //+ 1 or more
    //{x,y} at least x times at most y times

    //+234-7654876523
    //^\+234-\d{10}
    static Pattern ngnPhonePattern = Pattern.compile("^\\+234-\\d{10}");

    //\d{2}-\d{2}-\d{4}
    //08-02-2024
    static Pattern datePattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    //if(var relational_op var)
    //^if\(\)
    static Pattern ifBlockPattern = Pattern.compile("^if\\(\\)");

    //^if\((<|>|==)\)
    static Pattern ifBlockWithOps = Pattern.compile("^if\\((<|>|==)\\)");
    static Pattern ifBlockWithOpsAndVars = Pattern.compile("^if\\([a-zA-Z]+(<|>|==)[a-zA-Z]+\\)");

    static boolean testRegs(){

        System.out.println("Phone NGN Regex: "+ ngnPhonePattern.matcher("+234-7654876523").find());
        System.out.println("Date Regex: "+ datePattern.matcher("08-02-2024").find());
        System.out.println("Plain If Block: "+ ifBlockPattern.matcher("if()").find());
        System.out.println("If Block with Ops: " + ifBlockWithOps.matcher("if(==)").find());
        System.out.println("If Block with Ops And Vars: " + ifBlockWithOpsAndVars.matcher("if(a==b)").find());
        return false;
    }
    public static void main(String[] args) {
        testRegs();
    }
}
