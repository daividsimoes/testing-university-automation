package br.com.testinguniversity.automation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import br.com.testinguniversity.automation.util.FakerUtils;

@SpringBootTest
@ContextConfiguration(classes = {ApplicationSpringBoot.class})
public abstract  class AbstractStepsDefinition {

    @Autowired
    protected FakerUtils fakerUtils;
}
