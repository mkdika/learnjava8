package com.mkdika.learnjava8.basic;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
public class EnumClass {

    public static void main(String[] args) {
        Season s = Season.AUTUM;
        System.out.println(Season.AUTUM + " Testing");
        System.out.println(Season.AUTUM.name());
        System.out.println(Season.AUTUM == s);

        for (Season ss : Season.values()) {
            System.out.println(ss.ordinal() + " " + ss.hashCode() + " " + ss.name());
        }

        // Enum with switch statemen
        switch (s) {
            case SPRING:
                System.out.println("This is a Spring Time ^^");
                break;
            case SUMMER:
                System.out.println("Summer are hot!");
                break;
            case AUTUM:
                System.out.println("Autum the romance time~");
                break;
            case WINTER:
                System.out.println("Winter Sonata.....");
        }

        System.out.println(Days.MONDAY.getDate());
        System.out.println(Days.SUNDAY);
        Season2.SUMMER.openHours();

        Season3.SPRING.openHours();
        Season3.SUMMER.openHours();
        Season3.AUTUM.openHours();
        Season3.WINTER.openHours();
    }

}

enum Season {
    SPRING, SUMMER, AUTUM, WINTER;
}

enum Days {
    SUNDAY(10), MONDAY(11);

    private int date;

    Days(int d) {
        date = d;
    }

    String getDate() {
        return this.name() + " " + date;
    }
}

enum Season2 {
    SPRING {
        @Override
        public void openHours() {
            System.out.println("8AM - 5PM");
        }
    },
    SUMMER {
        @Override
        public void openHours() {
            System.out.println("9AM - 6PM");
        }
    },
    AUTUM {
        @Override
        public void openHours() {
            System.out.println("9AM - 4PM");
        }
    },
    WINTER {
        @Override
        public void openHours() {
            System.out.println("11AM - 3PM");
        }
    };

    public abstract void openHours();
}

enum Season3 {
    WINTER {
        @Override
        public void openHours() {
            System.out.println("Short Hour");
        }

    }, AUTUM, SPRING, SUMMER;

    public void openHours() {
        System.out.println("Default Hours");                
    }
}
