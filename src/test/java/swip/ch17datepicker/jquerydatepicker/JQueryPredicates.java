package swip.ch17datepicker.jquerydatepicker;


import swip.ch15pageflow.framework.Element;
import swip.ch15pageflow.framework.ExplicitWait;

import java.util.Optional;
import java.util.function.Predicate;

public enum JQueryPredicates implements Predicate<ExplicitWait> {

    JQUERY_CALENDAR_CLOSED {
        @Override
        public boolean test(ExplicitWait explicitWait) {
            Optional<Element> element = explicitWait.optionalElement(JQueryById.UI_DATEPICKER_DIV);
            return !element.isPresent() || !element.get().isDisplayed();
        }
    }

}