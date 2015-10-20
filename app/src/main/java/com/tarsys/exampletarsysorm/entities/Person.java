package com.tarsys.exampletarsysorm.entities;

import com.github.tarsys.android.orm.annotations.DBEntity;
import com.github.tarsys.android.orm.annotations.TableField;

import java.util.ArrayList;

/**
 * Created by tarsys on 10/10/15.
 */
@DBEntity
public class Person {
    //region private vars
    private String personalIdentification;
    private String name;
    private String lastname1;
    private String lastname2;
    private  ArrayList<Car> cars;
    //endregion

    public Person(){
        this.cars = new ArrayList<>();
    }
    public Person(String identifier){
        this();
        this.personalIdentification = identifier;
    }

    @TableField(DataTypeLength = 30, PrimaryKey = true, NotNull = true)
    public String getPersonalIdentification() {
        return personalIdentification;
    }
    public void setPersonalIdentification(String personalIdentification) {
        this.personalIdentification = personalIdentification;
    }

    @TableField
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @TableField
    public String getLastname1() {
        return lastname1;
    }
    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    @TableField
    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    @TableField
    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }
}
