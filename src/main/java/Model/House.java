package Model;

import java.util.List;

/**
 * Created by Kenneth, Nikolay, Sherafgan, Victor on 2/29/16.
 */
public class House {
    private double ID;
    private List<Device> devices;
    private List<UserProfile> users;
    private Statistics statistics;

    public boolean addDevice(Device device){
        return false;
    }

    public boolean deleteDevice(Device device){
        return false;
    }

    public boolean updateStatistics(Statistics statistics){
        return false;
    }

    public Statistics getStatistics(){
        return statistics;
    }
}
