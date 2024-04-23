/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import domain.City;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author student2
 */
public class CityRepository {
    private List<City> cities;
    
    public CityRepository() {
        cities = new ArrayList<>();
        cities.add(new City(110001, "Beograd"));        
        cities.add(new City(13000, "Pancevo"));
        cities.add(new City(18000, "Leskovac"));
        cities.add(new City(16000, "Nis"));
        cities.add(new City(11300, "Smederevo"));

    }

    public List<City> getCities() {
        return cities;
    }
    
    
}
