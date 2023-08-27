import inmemory.ModelStore;
import inmemory.Observer1;
import models.*;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Point3D point = new Point3D(1, 2, 3);
        ArrayList<Point3D> points = new ArrayList<>();
        points.add(point);
        Poligon poligon = new Poligon(points);
        ArrayList<Poligon> poligons = new ArrayList<>();
        poligons.add(poligon);
        PoligonalModel pm = new PoligonalModel(poligons);
        ArrayList<PoligonalModel> poligonalModels = new ArrayList<>();
        poligonalModels.add(pm);
        Flash f = new Flash(new Point3D(1, 2, 3), new Angle3D(15), Color.White, 125);
        Camera c = new Camera(new Point3D(12, 154, 19), new Angle3D(15));
        ArrayList<Flash> flashes = new ArrayList<>();
        flashes.add(f);
        ArrayList<Camera> cameras = new ArrayList<>();
        cameras.add(c);
        Scene s = new Scene(poligonalModels, flashes, cameras);
        ArrayList<Scene> scenes = new ArrayList<>();
        scenes.add(s);
        Observer1 obs1 = new Observer1();
        ModelStore ms = new ModelStore(poligonalModels, flashes, scenes, cameras);
        ms.RegisterModelChanger(obs1);
        ms.add(pm);
    }
}
