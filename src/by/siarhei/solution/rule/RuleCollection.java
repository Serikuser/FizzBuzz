package by.siarhei.solution.rule;

import by.siarhei.solution.tag.Tag;

import java.util.Arrays;
import java.util.List;

public abstract class RuleCollection {

    List<AbstractRule> ruleList;

    public RuleCollection(AbstractRule... rules) {
        this.ruleList = Arrays.asList(rules);
    }

    public abstract Tag find(int number);
}
