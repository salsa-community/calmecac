package mx.calmecac.springmvc.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import mx.calmecac.springmvc.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
