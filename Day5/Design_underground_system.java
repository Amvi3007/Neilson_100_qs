package Day5;
import java.util.*;

public class Design_underground_system {

    static class UndergroundSystem {

        public class CheckIns{
            String starting_station;
            int time;
            CheckIns(String starting_station,int time){
                this.time = time;
                this.starting_station = starting_station;
            }
        }

        public class Route{
            int total_time = 0;
            int trips = 0;
            Route(){
                total_time = 0;
                trips = 0;
            }
        }

        HashMap<Integer,CheckIns> checkin;
        HashMap<String,Route> route; 
        public UndergroundSystem() {
            checkin = new HashMap<>();
            route = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            checkin.put(id,new CheckIns(stationName, t));
        }

        public void checkOut(int id, String stationName, int t) {
            CheckIns c = checkin.get(id);
            int total_time = t - c.time;
            String stn = c.starting_station + "->" + stationName;
            if(!route.containsKey(stn)){
                route.put(stn,new Route());
            }
            route.get(stn).total_time+=total_time;
            route.get(stn).trips+=1;
        }

        public double getAverageTime(String startStation, String endStation) {
            String s = startStation+"->"+endStation;
            Route r = route.get(s);
            return (double) r.total_time/r.trips;
        }
    }

    public static void main(String[] args) {

        UndergroundSystem obj = new UndergroundSystem();

        obj.checkIn(1, "A", 3);
        obj.checkOut(1, "B", 15);

        obj.checkIn(2, "A", 10);
        obj.checkOut(2, "B", 30);

        obj.checkIn(3, "B", 40);
        obj.checkOut(3, "A", 50);

        System.out.println(obj.getAverageTime("A", "B"));
        System.out.println(obj.getAverageTime("B", "A"));
    }

}
