package dependency_injection.test;
import dependency_injection.Developer;
import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InjectionJavaTest {
    @Test
    public void inject(){
        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        try(SeContainer initialize = initializer.initialize()) {
            Instance<Developer> awesomeDeveloper = initialize.select(Developer.class);
            Developer developer = awesomeDeveloper.get();
            Assertions.assertNotNull(developer);
            String message = developer.develop();
            System.out.println("Message = "+message);
            Assertions.assertTrue(message.contains("fire"));
        }
    }
}
