package pro.sdacademy.designpatterns.structural.decorator;

public interface FragStatistics {

  int incrementFragCount();

  int incrementDeathCount();

  void reset();
}
