package by.siarhei.solution.condition.impl;

import by.siarhei.solution.condition.api.AbstractCondition;

public class DivideCondition implements AbstractCondition {

    private int divider;

    public DivideCondition(int divider){
        this.divider = divider;
    }

    @Override
    public boolean isTrue(int number) {
        return number % this.divider == 0;
    }
}
