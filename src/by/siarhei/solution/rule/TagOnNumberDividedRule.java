package by.siarhei.solution.rule;

import by.siarhei.solution.condition.api.AbstractCondition;
import by.siarhei.solution.tag.Tag;

public class TagOnNumberDividedRule extends AbstractRule{
    public TagOnNumberDividedRule(Tag tag, AbstractCondition condition){
       super(tag, condition);
    }

    @Override
    boolean isRuleFulfilled(int number) {
        return this.condition.isTrue(number);
    }
}
