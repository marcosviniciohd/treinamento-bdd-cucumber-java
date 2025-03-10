package br.com.marcos.vinicio;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
plugin = "pretty",
monochrome = true,
snippets = CucumberOptions.SnippetType.CAMELCASE,
features = "src/test/java/br/com/marcos/vinicio/features",
glue = "br.com.marcos.vinicio.passos")

public class IniciaTestes {

}
