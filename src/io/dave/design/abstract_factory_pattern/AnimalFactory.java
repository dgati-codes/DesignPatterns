package io.dave.design.abstract_factory_pattern;

public abstract class AnimalFactory {
    public abstract Animal getAnimal(AnimalType type);
    public static AnimalFactory getAnimalFactory(AnimalFactoryType type){
            AnimalFactory factory= null;
            if(type.equals(AnimalFactoryType.SEA)){
                factory= new SeaAnimalFactory();
            } else if(type.equals(AnimalFactoryType.LAND)){
                factory=new LandAnimalFactory();
            }
        return factory;
    }
}
