package models;

import java.util.ArrayList;

public class Scene {
    private static int counter = 0;
    final private int id;

    private ArrayList<PoligonalModel> models = new ArrayList<>();
    private ArrayList<Flash> flashes = new ArrayList<>();
    private ArrayList<Camera> cameras = new ArrayList<>();

    {
        id = ++counter;
    }

    public Scene(ArrayList<PoligonalModel> models, ArrayList<Camera> cameras) {
        this.models = models;
        this.cameras = cameras;
    }

    public Scene(ArrayList<PoligonalModel> models, ArrayList<Flash> flashes, ArrayList<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }
}
