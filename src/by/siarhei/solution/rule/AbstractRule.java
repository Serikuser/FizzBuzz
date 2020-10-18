package by.siarhei.solution.rule;

import by.siarhei.solution.condition.api.AbstractCondition;
import by.siarhei.solution.tag.Tag;

public abstract class AbstractRule {
    Tag tag;
    AbstractCondition condition;

    public AbstractRule(Tag tag, AbstractCondition condition){
        this.tag = tag;
        this.condition = condition;
    }

    abstract boolean isRuleFulfilled(int number);

    public Tag getTag() {
        return this.tag;
    }
}
