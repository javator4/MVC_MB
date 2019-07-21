package pl.sda.mvc.Controller;

import pl.sda.mvc.Model.GiantModel;
import pl.sda.mvc.View.GiantView;
import pl.sda.mvc.Model.*;

public class GiantController {
    private GiantModel giant;
    private GiantView view;

    public GiantController(GiantModel giantModel, GiantView giantView) {
        this.giant = giantModel;
        this.view = giantView;
    }

    public Health getHealth(){
        return this.giant.getHealth();
    }

    public void setHealth(Health health){
        this.giant.setHealth(health);
    }

    public Fatigue getFatigue(){
        return this.giant.getFatigue();
    }

    public void setFatigue(Fatigue fatigue){
        this.giant.setFatigue(fatigue);
    }

    public Nourishment getNourishment(){
        return this.giant.getNourishment();
    }

    public void setNourishment(Nourishment nourishment){
        this.giant.setNourishment(nourishment);
    }

    public void updateView(){
        this.view.displayGiant(this.giant);
    }
}