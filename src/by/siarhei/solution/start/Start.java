package by.siarhei.solution.start;

import by.siarhei.solution.condition.api.AbstractCondition;
import by.siarhei.solution.condition.impl.AndCondition;
import by.siarhei.solution.condition.impl.DivideCondition;
import by.siarhei.solution.printer.Printer;
import by.siarhei.solution.rule.AbstractRule;
import by.siarhei.solution.rule.RuleCollection;
import by.siarhei.solution.rule.TagOnNumberDividedRule;
import by.siarhei.solution.rule.TagOnNumberDividedRuleCollection;
import by.siarhei.solution.tag.Tag;
import by.siarhei.solution.tag.TagOnNumber;

public class Start {
    private static final int MAX_RANGE = 100;

    public static void main(String[] args) {
        AbstractCondition divideOnThree = new DivideCondition(3);
        AbstractCondition divideOnFive = new DivideCondition(5);
        AbstractRule fizzRule = new TagOnNumberDividedRule(new TagOnNumber("Fizz"), divideOnThree);
        AbstractRule buzzRule = new TagOnNumberDividedRule(new TagOnNumber("Buzz"), divideOnFive);
        AbstractRule complexRule = new TagOnNumberDividedRule(new TagOnNumber("FizzBuzz"), new AndCondition(divideOnFive, divideOnThree));
        RuleCollection ruleCollection = new TagOnNumberDividedRuleCollection(complexRule, fizzRule, buzzRule);
        Printer<Tag> printer = new Printer<>();
        for (int i = 1; i <= MAX_RANGE; i++) {
            printer.setContext(ruleCollection.find(i));
            printer.print();
        }
    }
}
