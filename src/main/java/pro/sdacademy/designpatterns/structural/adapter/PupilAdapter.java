package pro.sdacademy.designpatterns.structural.adapter;

import java.util.Collection;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 * @since
 */
public class PupilAdapter implements Student {

  private final Pupil pupil;

  public PupilAdapter(final Pupil pupil) {
    this.pupil = pupil;
  }

  @Override
  public String getFullName() {
    return pupil.getFirstName() + " " + pupil.getLastName();
  }

  @Override
  public String getContactDetails() {
    return pupil.getEmail();
  }

  @Override
  public boolean isAdult() {
    return pupil.getAge() >= 18;
  }

  @Override
  public Collection<Integer> getResults() {
    return pupil.getGrades();
  }
}