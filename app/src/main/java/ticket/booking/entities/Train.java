package ticket.booking.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private String trainId;
    private  String trainNo;
    private List<List<Integer>> seats;
    private List<String> stations;
    private  Map<String,String> stationTime;
    public  Train(String trainId, String trainNo, List<List<Integer>> seats, List<String> stations, Map<String,String> stationTime) {
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.seats = seats;
        this.stations = stations;
        this.stationTime = stationTime;
    }

    public List<String> getStations() {
        return stations;
    }
    public void setStations(List<String> stations) {
        this.stations = stations;
    }
    public String getTrainId() {
        return trainId;
    }
    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }
    public String getTrainNo() {
        return trainNo;
    }
    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }
    public List<List<Integer>> getSeats() {
        return seats;
    }
    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }
    public Map<String, String> getStationTime() {
        return stationTime;
    }
    public void setStationTime(Map<String, String> stationTime) {
        this.stationTime = stationTime;
    }
    public String getTrainInfo() {
        return  String.format("Train ID: %s, Train No: %s", trainId, trainNo);
    }

}
