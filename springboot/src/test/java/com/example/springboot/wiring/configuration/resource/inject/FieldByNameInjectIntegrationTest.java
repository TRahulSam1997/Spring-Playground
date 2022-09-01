package com.example.springboot.wiring.configuration.resource.inject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;
import javax.inject.Named;

import com.example.springboot.wiring.configuration.ApplicationContextTestInjectName;
import com.example.springboot.wiring.dependency.ArbitraryDependency;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        loader=AnnotationConfigContextLoader.class,
        classes= ApplicationContextTestInjectName.class)
public class FieldByNameInjectIntegrationTest {
    @Inject
    @Named("yetAnotherFieldInjectDependency")
    private ArbitraryDependency yetAnotherFieldInjectDependency;

    @Test
    public void givenInjectQualifier_WhenSetOnField_ThenDependencyValid() {
        assertNotNull(yetAnotherFieldInjectDependency);
        assertEquals("Yet Another Arbitrary Dependency",
                yetAnotherFieldInjectDependency.toString());
    }
}
