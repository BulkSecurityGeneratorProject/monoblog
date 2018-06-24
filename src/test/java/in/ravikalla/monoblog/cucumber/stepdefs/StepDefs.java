package in.ravikalla.monoblog.cucumber.stepdefs;

import in.ravikalla.monoblog.MonoblogApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MonoblogApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
