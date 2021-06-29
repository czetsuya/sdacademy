package pro.sdacademy.designpatterns.behavioral.decorator;

public interface FragStatistics {

  int incrementFragCount();

  int incrementDeathCount();

  void reset();
}
