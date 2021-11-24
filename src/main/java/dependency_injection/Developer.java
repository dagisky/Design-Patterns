package dependency_injection;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Developer {
    @Inject
    Monster monsterDrink;

    public String develop(){
        return this.monsterDrink.drink() + " for development";
    }
}
