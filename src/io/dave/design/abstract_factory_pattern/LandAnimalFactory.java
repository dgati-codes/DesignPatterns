package io.dave.design.abstract_factory_pattern;

public class LandAnimalFactory extends AnimalFactory{

    @Override
    public Animal getAnimal(AnimalType type) {
        Animal animal=null;
        if(type.equals(AnimalType.CAT)){
            animal=new Cat();
        }else if(type.equals(AnimalType.DOG)){
            animal=new Dog();
        }else if(type.equals(AnimalType.LION)){
            animal=new Lion();
        }else {
            throw new IllegalArgumentException("Animal name not present");
        }
        return animal;

    }
}
