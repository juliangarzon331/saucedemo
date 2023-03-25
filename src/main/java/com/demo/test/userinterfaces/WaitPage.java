package com.demo.test.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.hyrtutorials.com/p/waits-demo.html")
public class WaitPage extends PageObject {

    public static final Target ADDTEXTBOX1= Target.the("boton AddTextbox1")
            .located(By.id("btn1"));
    public static final Target INPUT_TEXTBOX1= Target.the("Input Textbox1")
            .located(By.id("txt1"));



}
