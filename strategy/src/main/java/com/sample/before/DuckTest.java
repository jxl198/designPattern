package com.sample.before;

import com.sample.before.entity.Duck;
import com.sample.before.entity.GreenDuck;
import com.sample.before.entity.RedDuck;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-06 17:09
 **/
public class DuckTest {

    public static void main(String[] args) {
        Duck greenDuck = new GreenDuck();
        greenDuck.display();
        greenDuck.fly();
        greenDuck.quack();
        greenDuck.swim();
        Duck redDuck = new RedDuck();
        redDuck.display();
        redDuck.fly();
        redDuck.quack();
        redDuck.swim();

    }
}
