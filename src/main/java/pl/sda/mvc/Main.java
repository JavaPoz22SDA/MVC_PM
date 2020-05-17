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

        List<GiantModel> giantModelList = new ArrayList<GiantModel>();
        giantModelList.add(giantModel);

        GiantController controller = new GiantController(giantModel,giantView);

        controller.updateView();
        controller.setHealth(Health.DEAD);
        controller.updateView();

    }
}
