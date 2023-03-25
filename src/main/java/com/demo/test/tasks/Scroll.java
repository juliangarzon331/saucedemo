package com.demo.test.tasks;

import com.demo.test.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Scroll  implements Task {

    LoginPage loginPage;
    @Override
    public <T extends Actor> void performAs(T actor) {
       //obtiene el driver de selenium
        JavascriptExecutor executor = (JavascriptExecutor) loginPage.getDriver();
        executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

    }



    public static Scroll toElementPage(){
        return instrumented(Scroll.class);

    }
}
