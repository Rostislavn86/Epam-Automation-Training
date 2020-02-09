import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;

public class PlaneMethods {
    private List<? extends Plane> planes;

    public List<PassengerPlane> getPasPl()
    {
        List<? extends Plane> l = this.planes;
        List<PassengerPlane> x = new ArrayList<>();
        for (Plane p : l) {if (p instanceof PassengerPlane) {x.add((PassengerPlane) p);}}
        return x;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) militaryPlanes.add((MilitaryPlane) plane);
        }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPasPl();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity())
                planeWithMaxCapacity = passengerPlanes.get(i);
        }
        return planeWithMaxCapacity;
    }

    public PlaneMethods sortByMaxDistance() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.GetMaxFlightDistance() - o2.GetMaxFlightDistance();
            }
        });
        return this;
    }

    public PlaneMethods sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(Plane o1, Plane o2) {
                return o1.getMaxSpeedS() - o2.getMaxSpeedS();
            }
        });
        return this;
    }

    @Override
    public String toString() {
        return planes.toString();
    }

    public PlaneMethods(List<? extends Plane> planes) {
        this.planes = planes;
    }

}
