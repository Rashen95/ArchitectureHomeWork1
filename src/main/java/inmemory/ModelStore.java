package inmemory;

import models.Camera;
import models.Flash;
import models.PoligonalModel;
import models.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {

    private List<ModelChangedObserver> observers = new ArrayList<>();

    private List<PoligonalModel> models = new ArrayList<>();
    private List<Flash> flashes = new ArrayList<>();
    private List<Scene> scenes = new ArrayList<>();
    private List<Camera> cameras = new ArrayList<>();

    public void add(PoligonalModel model) {
        models.add(model);
        notifyChange();
    }

    public ModelStore(List<PoligonalModel> models, List<Flash> flashes, List<Scene> scenes, List<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.scenes = scenes;
        this.cameras = cameras;
    }

    @Override
    public void notifyChange() {
        for (ModelChangedObserver observer : observers) {
            observer.applyUpdateModel();
        }
    }

    @Override
    public void RegisterModelChanger(ModelChangedObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver o) {
        observers.remove(o);
    }
}
