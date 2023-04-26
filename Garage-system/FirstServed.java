package SW_assignment;

import java.util.ArrayList;

//SubClass
public class FirstServed implements SlotConfiguration{
    public int park(Vehicle car, ArrayList<SlotController> garage, int numOfSlots) {
        int index = 0;
        for (int i = 0; i < numOfSlots; i++) {
            if (garage.get(i).getSlot().getAvailability() == true) {
                if (garage.get(i).getSlot().getSlotWidth() >= car.getVehicleWidth()
                        && garage.get(i).getSlot().getSlotDepth() >= car.getVehicleDepth()) {
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
}