package com.sample.abstractfactory;

/**
 * @author jiangxl
 * @description
 * @date 2018-11-21 11:13
 **/
public class FactoryCreator {

    public static IFactory createFactory(String type){
        IFactory factory = null;
        if("cheese".equals(type)){
            factory =  new CheeseFactory();
        }else if ("bacon".equals(type)){
            factory=new BaconFactory();
        }else if("pepper".equals(type)){
            factory=new PepperFactory();
        }

        return factory;
    }

    public static IFactory createFactory(Class<? extends IFactory> clazz) throws IllegalAccessException, InstantiationException {
      if(clazz !=null){
          IFactory factory =clazz.newInstance();
          return factory;
      }
      return null;
    }
}
