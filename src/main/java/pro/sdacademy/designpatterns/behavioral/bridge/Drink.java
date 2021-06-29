package pro.sdacademy.designpatterns.behavioral.bridge;

public interface Drink {

  String getVolume();

  boolean isAddictive();

  int getNumberOfSugarLumps();

  Taste getTaste();
}
