package com.demo.test.tasks;

import com.demo.test.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Login implements Task {

    private String usuario;
    private String password;

    public Login(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue(usuario).into(LoginPage.INPUT_USERNAME),
                    Enter.theValue(password).into(LoginPage.INPUT_PASS),
                Click.on(LoginPage.BTN_LOGIN)


        );

    }

    public static Login enterCredentials(String usuario, String password){
        return instrumented(Login.class, usuario, password);
    }

}
