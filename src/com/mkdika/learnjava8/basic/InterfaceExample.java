package com.mkdika.learnjava8.basic;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
interface Walk {

    boolean isQuadruped();

    double getMaxSpeed();
}

interface Run extends Walk {

    public abstract boolean canHuntWhileRunning();

    @Override
    double getMaxSpeed();
}

class Lion implements Run {

    @Override
    public boolean isQuadruped() {
        return true;
    }

    @Override
    public boolean canHuntWhileRunning() {
        return true;
    }

    @Override
    public double getMaxSpeed() {
        if (null instanceof Lion) {
            
        }
        return 100;
    }
}
