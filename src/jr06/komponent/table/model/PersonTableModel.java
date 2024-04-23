/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jr06.komponent.table.model;

import domain.City;
import domain.Person;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author student2
 */
public class PersonTableModel extends AbstractTableModel {

    private List<Person> persons;

    public PersonTableModel(List<Person> persons) {
        this.persons = persons;
    }
    
    
    
    @Override
    public int getRowCount() {
        if (persons==null) return 0;
        else return persons.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Person person  =persons.get(rowIndex);
        switch (columnIndex) {
            case 0: return person.getId();
            case 1: return person.getFirstname();
            case 2: return person.getLastname();
            case 3: return person.getAge();
            case 4: return person.getCity();
            default: return "/";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "JMBG";
            case 1: return "Ime";
            case 2: return "Prezime";
            case 3: return "Godina";
            case 4: return "Grad";
            default: return "/";
        }
        
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex==0) return false;
        else return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Person person =persons.get(rowIndex);
        switch (columnIndex) {
            case 0: break; //nikad nece da se desi
            case 1: 
                person.setFirstname(aValue.toString());
                break;
            case 2: person.setLastname(aValue.toString());
                break;
            case 3: 
                person.setAge(Integer.parseInt(aValue.toString()));
                break;
            case 4: 
                //To do
                break;
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {

        if (columnIndex==3) return Integer.class;
        if (columnIndex==4) return City.class;
        return String.class;
    }

    public void addRow() {
     
        persons.add(new Person("/","/","/",0,new City(11000L,"Beograd")));
        
        fireTableDataChanged(); //ponovo crtaj tabelu;
    }
    
    
    
    
    
    
}
