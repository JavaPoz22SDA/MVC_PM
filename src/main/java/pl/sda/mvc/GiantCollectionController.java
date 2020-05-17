package pl.sda.mvc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Paweł Matyaszczyk
 */
public class GiantCollectionController {
    private GiantView giantView;
    private List<GiantModel> giantModelList = new ArrayList();

    public GiantCollectionController( List<GiantModel> giantModelList, GiantView giantView) {
        this.giantView = giantView;
        this.giantModelList = giantModelList;
    }

    public void updateView(){
        for (GiantModel model: giantModelList) {
            this.giantView.displayGiant(model);
        }
    }

    public Health getHealth(int index){
        return this.giantModelList.get(index).getHealth();
    }

    public void setHealth(Health health, int index){
        this.giantModelList.get(index).setHealth(health);
    }

    public Fatigue getFatigue(int index){
        return this.giantModelList.get(index).getFatigue();
    }

    public void setFatigue(Fatigue fatigue, int index){
        this.giantModelList.get(index).setFatigue(fatigue);
    }

    public Nourishment getNourishment(int index){
        return this.giantModelList.get(index).getNourishment();
    }

    public void setNourishment(Nourishment nourishment, int index){
        this.giantModelList.get(index).setNourishment(nourishment);
    }

    public List<GiantModel> getGiantModelList() {
        return giantModelList;
    }
}
