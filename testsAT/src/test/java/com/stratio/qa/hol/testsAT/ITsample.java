package com.stratio.qa.hol.testsAT;
import com.stratio.qa.cucumber.testng.CucumberRunner;
import com.stratio.qa.data.BrowsersDataProvider;
import com.stratio.qa.hol.utils.BaseTest;
import cucumber.api.CucumberOptions;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

@CucumberOptions(features = { "src/test/resources/features/sample.feature" })
public class ITsample extends BaseTest {

    @Factory(enabled = false, dataProviderClass = BrowsersDataProvider.class, dataProvider = "availableUniqueBrowsers")
    public ITsample(String browser) {
        this.browser = browser;
    }

    @Test(enabled = true, groups = {"hol"})
    public void test() throws Exception {
        new CucumberRunner(this.getClass()).runCukes();
    }
}