module org.jeasy.rules.tutorials {
    requires org.jeasy.rules;
    requires javax.servlet.api;
    requires org.jeasy.rules.support;
    requires org.jeasy.rules.mvel;


    opens org.jeasy.rules.tutorials.airco;
    opens org.jeasy.rules.tutorials.fizzbuzz;
    opens org.jeasy.rules.tutorials.web;
    opens org.jeasy.rules.tutorials.helloworld;
    opens org.jeasy.rules.tutorials.shop;
    opens org.jeasy.rules.tutorials.weather;

    exports org.jeasy.rules.tutorials.airco;
    exports org.jeasy.rules.tutorials.fizzbuzz;
    exports org.jeasy.rules.tutorials.web;
    exports org.jeasy.rules.tutorials.helloworld;
    exports org.jeasy.rules.tutorials.shop;
    exports org.jeasy.rules.tutorials.weather;


}