package pl.sda.mvc;

/**
 * @author Paweł Matyaszczyk
 */
public class Main {
    public static void main(String[] args) {
        GiantView giantView = new GiantView();
        GiantModel giantModel = new GiantModel(Health.HEALTH,Fatigue.SLEEPING,Nourishment.SATURATED);

        System.out.println(giantModel);

        GiantController controller = new GiantController(giantModel,giantView);
        controller.updateView();
    }
}
