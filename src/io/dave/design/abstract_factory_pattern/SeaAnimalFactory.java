package io.dave.design.abstract_factory_pattern;

public class SeaAnimalFactory extends AnimalFactory{
    @Override
    public Animal getAnimal(AnimalType type) {
        Animal animal = null;
        if(type.equals(AnimalType.WHALE)){
            animal=new Whale();
        }else if(type.equals(AnimalType.SHARK)){
            animal=new Shark();
        }else {
            throw new IllegalArgumentException("Animal name not present");
        }
        return animal;
    }
}
