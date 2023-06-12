package Demo.cjc.run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/resources/features/Registration.feature"} ,glue = {"Demo.cjc.stefdef"},tags = {"@Abc,@Def,@Ghi,@Jkl"})
public class Runner {

}
