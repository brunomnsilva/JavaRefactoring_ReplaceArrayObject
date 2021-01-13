package pt.pa.refactoring;

import java.util.ArrayList;
import java.util.List;

public class DistrictData {

    private List<Object[]> districts;

    public DistrictData() {
        districts = new ArrayList<>();
    }

    public boolean add(String district, int population) {
        if(!containsDistrict(district)) {
            Object[] data = new Object[]{district, population};
            districts.add(data);
            return true;
        }
        return false;
    }

    private boolean containsDistrict(String district) {
        for(int i=0; i<districts.size(); i++) {
            Object[] data = districts.get(i);

            if(((String)data[0]).equalsIgnoreCase(district)) return true;
        }
        return false;
    }

    public int getTotalPopulation() {
        int total = 0;
        for(int i=0; i<districts.size(); i++) {
            Object[] data = districts.get(i);

            total += (int)data[1];
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s | %5s\n", "District", "Population"));
        sb.append(String.format("%-20s | %5s\n", "--------", "----------"));
        for(int i=0; i<districts.size(); i++) {
            Object[] data = districts.get(i);

            sb.append(String.format("%-20s | %5d\n", data[0], data[1]));
        }
        return sb.toString();
    }
}
