package swip.ch18datepicker.jquery.v3;

import swip.framework.Browser;
import swip.framework.datepicker.Calendar;
import swip.framework.datepicker.CalendarPicker;
import swip.framework.datepicker.Datepicker;

import java.time.Month;

import static swip.locators.jquery.JQueryById.TRIGGER_BY;

public class JQueryDatepickerPage {

    private final Browser browser;    //<1>
    private final Datepicker datepicker;   //<2>

    public JQueryDatepickerPage(Browser browser) {   //<3>
        this.browser = browser;
        this.datepicker = new Datepicker(  //<4>
            new Calendar(browser, new Trigger()),
            new CalendarPicker(browser,
                new PreviousYear(), new NextYear(), new DisplayYear()),
            new CalendarPicker(browser,
                new PreviousMonth(), new NextMonth(), new DisplayMonth()),
            new JQueryDayPicker(browser)
        );
    }

    public void pick(Month month, int day, int year) {
        datepicker.pick(month, day, year);
    }  //<9>

    public String getDate() {
        return browser.getInputText(TRIGGER_BY);
    }       //<10>

}
