package org.jeasy.rules.core;

import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.junit.Test;

import java.util.Iterator;

import static org.assertj.core.api.Assertions.assertThat;

public class SmartRuleNameTest {


    @Test
    public void rulesImplementingSmartRuleTestShouldReturnCorrectNames() throws Exception {
        // Given
        MyBasicRule myBasicRule = new MyBasicRule();
        myBasicRule.setSmartRuleName("First Smart Name");

        Rules rules = new Rules();
        rules.register(myBasicRule);

        Iterator<Rule> rulesIterator = rules.iterator();
        while (rulesIterator.hasNext()) {
            Rule currentAndOnlyRule = rulesIterator.next();
            assertThat(currentAndOnlyRule.getName()).isEqualTo("First Smart Name");
        }

    }

}
