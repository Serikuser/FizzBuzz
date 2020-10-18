package by.siarhei.solution.condition.impl;

import by.siarhei.solution.condition.api.AbstractCondition;

import java.util.Arrays;
import java.util.List;

public class AndCondition implements AbstractCondition {

    private List<AbstractCondition> conditionList;

    public AndCondition(AbstractCondition... conditions) {
        this.conditionList = Arrays.asList(conditions);
    }

    @Override
    public boolean isTrue(int number) {
        for (AbstractCondition condition : this.conditionList) {
            if (!condition.isTrue(number)) {
                return false;
            }
        }
        return true;
    }
}
