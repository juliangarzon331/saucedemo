package com.demo.test.userinterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    public static final Target INPUT_USERNAME= Target.the("Usuario")
            .located(By.xpath("//input[@data-test='username']"));
    public static final Target INPUT_PASS = Target.the("Contrasena")
            .located(By.xpath("//input[@data-test='password']"));
    public static final Target BTN_LOGIN = Target.the("Contrasena")
            .located(By.xpath("//input[@data-test='login-button']"));


}
