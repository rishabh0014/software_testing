package project;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        Reuse.recurse(res, 0, 0, "", n);
        return res;
    }

    // See above tree diagram with parameters (left, right, s) for better
    // understanding

}
