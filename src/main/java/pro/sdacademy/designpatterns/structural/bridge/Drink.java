package pro.sdacademy.designpatterns.structural.bridge;

public interface Drink {

  String getVolume();

  boolean isAddictive();

  int getNumberOfSugarLumps();

  Taste getTaste();
}
