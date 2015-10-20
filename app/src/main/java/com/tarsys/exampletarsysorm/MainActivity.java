package com.tarsys.exampletarsysorm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.tarsys.android.orm.engine.SGBDEngine;
import com.tarsys.exampletarsysorm.entities.Car;
import com.tarsys.exampletarsysorm.entities.Person;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (SGBDEngine.Initialize(this)){
            Person person = new Person();
            person.setPersonalIdentification("12345678Z");
            person.setName("Name");
            person.setLastname1("Last Name 1");
            person.setLastname2("Last Name 2");

            Car car1 = new Car();
            car1.setIdentifier("1234ABC");
            car1.setTradeMark("Toyota");
            car1.setModel("Avensis");

            Car car2 = new Car();
            car2.setIdentifier("6543FDS");
            car2.setTradeMark("VolksWagen");
            car2.setModel("Passat");

            person.getCars().add(car1); person.getCars().add(car2);

            SGBDEngine.saveEntity(person);

            ArrayList<Person> persons = SGBDEngine.filterQuery(Person.class, null,null,null, true);
            if (persons != null){
                /// ...
            }


            Person person1 = SGBDEngine.findPrimaryKeyEntity(new Person("12345678Z"), true);
        }
    }
}
