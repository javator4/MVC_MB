package pl.sda.mvc;

import pl.sda.mvc.Controller.GiantController;
import pl.sda.mvc.Model.Fatigue;
import pl.sda.mvc.Model.GiantModel;
import pl.sda.mvc.Model.Nourishment;
import pl.sda.mvc.View.GiantView;
import pl.sda.mvc.Model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args){

        GiantModel giantModel = new GiantModel(Health.HEALTHY, Fatigue.NOTTIRED, Nourishment.HUNGRY);
        GiantView giantView = new GiantView();

        GiantController controller = new GiantController(giantModel,giantView);
        controller.updateView();
        controller.setHealth(Health.HEALTHY);
        controller.updateView();
        controller.setFatigue(Fatigue.TIRED);
        controller.updateView();

    }
}
