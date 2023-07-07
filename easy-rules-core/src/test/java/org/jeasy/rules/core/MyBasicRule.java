package org.jeasy.rules.core;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;


/** Test smartRuleName on rule registration
 *
 */
@Rule
public class MyBasicRule implements SmartRuleName {

    String smartRuleName;

    @Override
    public void setSmartRuleName(String smartRuleName) {
        this.smartRuleName = smartRuleName;
    }

    @Override
    public String getSmartRuleName() {
        return this.smartRuleName;
    }

    @Condition
    public boolean someEmptyCondition(Facts facts) {
        return true;    //always succeeds
    }

    @Action
    public void someEmptyAction() {

    }

}
