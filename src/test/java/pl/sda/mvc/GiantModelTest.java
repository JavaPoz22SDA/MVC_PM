package pl.sda.mvc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GiantModelTest {
    @Test
    public void testSetHealth(){
        final GiantModel giantModel = new GiantModel(Health.HEALTH, Fatigue.TIRED, Nourishment.HUNGRY);
        for (final Health health: Health.values()){
            giantModel.setHealth(health);
            assertEquals(health,giantModel.getHealth());
        }
    }

    @Test
    public void testSetNourishment(){
        final GiantModel giantModel = new GiantModel(Health.HEALTH, Fatigue.TIRED, Nourishment.HUNGRY);
        for (final Nourishment nourishment: Nourishment.values()){
            giantModel.setNourishment(nourishment);
            assertEquals(nourishment,giantModel.getNourishment());
        }
    }

    @Test
    public void testSetFatigue(){
        final GiantModel giantModel = new GiantModel(Health.HEALTH, Fatigue.TIRED, Nourishment.HUNGRY);

        for (final Fatigue fatigue: Fatigue.values()){
            giantModel.setFatigue(fatigue);
            assertEquals(fatigue,giantModel.getFatigue());
        }
    }

}