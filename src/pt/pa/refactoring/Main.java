package pt.pa.refactoring;

public class Main {

    public static void main(String[] args) {

        DistrictData districts = new DistrictData();
        populate(districts);

        System.out.println(districts.toString());
        System.out.println(String.format("Total population: %d", districts.getTotalPopulation()));
    }

    private static void populate(DistrictData d) {
        d.add("Lisboa", 2244984);
        d.add("Porto", 2027191);
        d.add("Setubal", 849842);
        d.add("Braga", 848444);
        d.add("Aveiro", 714351);
        d.add("Leiria", 470765);
        d.add("Santarém", 454456);
        d.add("Coimbra", 429714);
        d.add("Viseu", 378166);
        d.add("Viana do Castelo", 244947);
        d.add("Vila Real", 207184);
        d.add("Castelo Branco", 195949);
        d.add("Evora", 167434);
        d.add("Guarda", 160931);
        d.add("Beja", 152706);
        d.add("Braganca", 136459);
        d.add("Portalegre", 118952);
        d.add("Portalegre", 118952); //duplicate on purpose
    }
}
