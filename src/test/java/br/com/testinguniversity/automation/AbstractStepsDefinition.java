package br.com.testinguniversity.automation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import br.com.testinguniversity.automation.util.FakerUtils;
import br.com.testinguniversity.automation.util.PropertiesUtils;

@SpringBootTest
@ContextConfiguration(classes = {ApplicationSpringBoot.class})
public abstract  class AbstractStepsDefinition {

    @Autowired
    protected PropertiesUtils propertiesUtils;

    @Autowired
    protected FakerUtils fakerUtils;
}
