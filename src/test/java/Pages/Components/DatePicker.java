package Pages.Components;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class DatePicker {
    public DatePicker setDate(String day,String month,String year){

        $(byCssSelector(".react-datepicker__year-select")).selectOptionByValue(year);
        $(byCssSelector(".react-datepicker__month-select")).selectOption(month);
        $(".react-datepicker__day--0"+ day +
                ":not(.react-datepicker__day--outside-month)").click();

        return this;
    }
}
