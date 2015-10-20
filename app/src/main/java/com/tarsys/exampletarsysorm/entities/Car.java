package com.tarsys.exampletarsysorm.entities;

import com.github.tarsys.android.orm.annotations.DBEntity;
import com.github.tarsys.android.orm.annotations.TableField;

/**
 * Created by tarsys on 20/10/15.
 */
@DBEntity
public class Car {
    private String identifier;
    private String tradeMark;
    private String model;

    public Car(){

    }

    public Car(String identifier){
        this.identifier = identifier;
    }

    @TableField(PrimaryKey = true)
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @TableField
    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    @TableField
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
