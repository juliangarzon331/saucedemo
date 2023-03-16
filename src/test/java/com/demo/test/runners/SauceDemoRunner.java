package com.demo.test.runners;


import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/saucedemo.feature",
        glue = "com.demo.test.stepsdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class SauceDemoRunner {
}
