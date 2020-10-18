package by.siarhei.solution.rule;

import by.siarhei.solution.tag.Tag;
import by.siarhei.solution.tag.TagOnNumber;

public class TagOnNumberDividedRuleCollection extends RuleCollection {

    public TagOnNumberDividedRuleCollection(AbstractRule... rules) {
        super(rules);
    }

    @Override
    public Tag find(int number) {
        for (AbstractRule rule : this.ruleList) {
            if (rule.isRuleFulfilled(number)){
                return rule.getTag();
            }
        }
        return new TagOnNumber(String.valueOf(number));
    }
}
