package utils;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
        features = "src/test/features",
        glue = "ru.test",
        tags = "@slotegrator"
)
public class RunnerTest {

}
