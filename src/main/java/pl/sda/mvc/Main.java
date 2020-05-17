package pl.sda.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paweł Matyaszczyk
 */
public class Main {
    public static void main(String[] args) {
        GiantView giantView = new GiantView();
        GiantModel giantModel = new GiantModel(Health.HEALTH,Fatigue.SLEEPING,Nourishment.SATURATED);
        GiantController controller = new GiantController(giantModel,giantView);
        controller.updateView();
        controller.setHealth(Health.DEAD);
        controller.updateView();


        GiantModel giantModel1 = new GiantModel(Health.HEALTH,Fatigue.SLEEPING,Nourishment.SATURATED);
        GiantModel giantModel2 = new GiantModel(Health.DEAD,Fatigue.TIRED,Nourishment.SATURATED);
        GiantModel giantModel3 = new GiantModel(Health.HEALTH,Fatigue.SLEEPING,Nourishment.HUNGRY);

        List<GiantModel> giantModelList = new ArrayList<GiantModel>();
        giantModelList.add(giantModel1);
        giantModelList.add(giantModel2);
        giantModelList.add(giantModel3);

        GiantCollectionController contrllerCollection = new GiantCollectionController(giantModelList,giantView);
        System.out.println("Potwory przed zmianą");
        contrllerCollection.updateView();

        for (int i = 0; i<giantModelList.size();i++){
            contrllerCollection.setHealth(Health.DEAD,i);
            contrllerCollection.setFatigue(Fatigue.TIRED,i);
            contrllerCollection.setNourishment(Nourishment.SATURATED,i);
        }
        System.out.println("Potwory po zmianie");
        contrllerCollection.updateView();



    }
}
