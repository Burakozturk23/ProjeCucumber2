package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void before() {
        System.out.println("senaryo başladı");

    }

    @After
    public void after() throws InterruptedException {
        GWD.quitDriver();
    }
}