package com.Klaus.Museum;

import com.Klaus.Logging.LogType;
import com.Klaus.Logging.SimpleLogger;

import java.util.Random;

public class Thief extends Visitor {
    private Random random = new Random();
    SimpleLogger logger = SimpleLogger.getInstance();

    public Thief(String name, int age, String placeOfResidence) {
        super(name, age, placeOfResidence);
    }

    public void stealArtwork() {
        if (currentRoom.getVisitors().size()-1 == 0 /*& currentRoom.getGuard().equals(null)*/) {
            currentRoom.removeArtwork(currentArtwork);
            logger.log(LogType.ERROR,"****** " + getName() + " stiehlt Kunstwerk " + currentArtwork.getTitle() + " ******");
            leaveMuseum();
        }
    }

    public void doSomething() {
        double r = random.nextDouble();
        if (r <= 0.4) {
            changeRoom();
            stealArtwork();
        } else if ((r > 0.4) & (r <= 0.8)) {
            changeArtwork();
            stealArtwork();
        } else if ((r > 0.8) & (r < 1)) {
            leaveMuseum();
        }
    }

        @Override
        public String toString() {
            return name + " (MEISTERDIEB, " + age + ") aus " + placeOfResidence;
        }

        public String toStringShort() {
        return name  + " (MEISTERDIEB)";
    }
}
