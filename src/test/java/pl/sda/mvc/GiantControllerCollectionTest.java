package pl.sda.mvc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class GiantControllerCollectionTest {

    private GiantModel giantModel;
    private GiantView giantView;
    private GiantCollectionController giantCollectionController;

    @BeforeEach
    public void  setUp(){
        System.out.println("Przed");
        GiantModel giantModel1 = new GiantModel(Health.HEALTH,Fatigue.TIRED, Nourishment.SATURATED);
        GiantModel giantModel2 = new GiantModel(Health.DEAD,Fatigue.SLEEPING, Nourishment.SATURATED);
        GiantModel giantModel3 = new GiantModel(Health.HEALTH,Fatigue.TIRED, Nourishment.HUNGRY);
        GiantModel giantModel4 = new GiantModel(Health.DEAD,Fatigue.SLEEPING, Nourishment.HUNGRY);
        List<GiantModel> models = new ArrayList<>();
        models.add(giantModel1);
        models.add(giantModel2);
        models.add(giantModel3);
        models.add(giantModel4);
        giantView = new GiantView();
        giantCollectionController = new GiantCollectionController(models,giantView);
    }

    @Test
    public void testSetHealth(){
        giantCollectionController.setHealth(Health.DEAD,0);
        assertEquals(Health.DEAD, giantCollectionController.getHealth(0));
    }

}