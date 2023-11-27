public class ActivityTracker {
    private int totalMinutes;
    private int goal;
    private int sessions;

    private int maxMinutes = 0;


    public int getMaxMinutes() {
        return maxMinutes;
    }

    public int getSessions() {
        return sessions;
    }

    public int getTotalMinutes() {
        return totalMinutes;
    }

    public ActivityTracker(int goal) {
        this.goal = goal;
    }

    public void logMinutes(int minutes) {
        totalMinutes += minutes;
        sessions++;
        if (minutes > maxMinutes){
            maxMinutes = minutes;
        }
    }

    public boolean goalAchieved() {
        if (totalMinutes >= goal) {
            return true;
        } else {
            return false;
        }
    }



}
