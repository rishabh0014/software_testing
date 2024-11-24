package project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class generate_parenthesis_test {

    @Test
    public void testGenerateParenthesisWithZero() {
        generate_parenthesis gp = new generate_parenthesis();
        List<String> result = gp.generateParenthesis(0);
        assertEquals(1, result.size(), "Should return 1 result for n=0");
        assertEquals("", result.get(0), "Result for n=0 should be an empty string");
    }

    @Test
    public void testGenerateParenthesisWithOne() {
        generate_parenthesis gp = new generate_parenthesis();
        List<String> result = gp.generateParenthesis(1);
        assertEquals(1, result.size(), "Should return 1 result for n=1");
        assertEquals("()", result.get(0), "Result for n=1 should be '()'");
    }

    @Test
    public void testGenerateParenthesisWithTwo() {
        generate_parenthesis gp = new generate_parenthesis();
        List<String> result = gp.generateParenthesis(2);
        assertEquals(2, result.size(), "Should return 2 results for n=2");
        assertEquals(List.of("(())", "()()"), result, "Results for n=2 should be '(())' and '()()'");
    }

    @Test
    public void testGenerateParenthesisWithThree() {
        generate_parenthesis gp = new generate_parenthesis();
        List<String> result = gp.generateParenthesis(3);
        assertEquals(5, result.size(), "Should return 5 results for n=3");
        assertEquals(
                List.of("((()))", "(()())", "(())()", "()(())", "()()()"),
                result,
                "Results for n=3 should match");
    }

    @Test
    public void testGenerateParenthesisWithFour() {
        generate_parenthesis gp = new generate_parenthesis();
        List<String> result = gp.generateParenthesis(4);
        assertEquals(14, result.size(), "Should return 14 results for n=4");
    }
}
