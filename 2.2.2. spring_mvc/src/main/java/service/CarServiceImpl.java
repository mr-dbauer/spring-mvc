
package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("car1", "user1", 111));
        list.add(new Car("car2", "user2", 222));
        list.add(new Car("car3", "user3", 333));
        return list;
    }
}