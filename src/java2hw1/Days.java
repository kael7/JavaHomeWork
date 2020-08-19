package java2hw1;

public enum Days {
    Monday(8), Tuesday(8), Wednesday(8), Thursday(8), Friday(8), Saturday(0), Sunday(0);

    private int hours;

    Days(int hours) {
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public static void getWorkingHours(Days days){
        switch (days){
            case Monday:
                System.out.printf("%d рабочих часов до конца недели", days.hours * 5);
                break;
            case Tuesday:
                System.out.printf("%d рабочих часов до конца недели", days.hours * 4);
                break;
            case Wednesday:
                System.out.printf("%d рабочих часов до конца недели", days.hours * 3);
                break;
            case Thursday:
                System.out.printf("%d рабочих часов до конца недели", days.hours * 2);
                break;
            case Friday:
                System.out.printf("%d рабочих часов до конца недели", days.hours);
                break;
            case Saturday:
                System.out.println("Сегодня выходной");
                break;
            case Sunday:
                System.out.println("Сегодня выходной");
                break;
        }

    }
}
