package edu.cnm.deepdive;

public class CanisLupusFamiliaris extends CanisLupus{

  private boolean goodBoy = true;

  public boolean isGoodBoy() {
    return goodBoy;
  }

  public void setGoodBoy(boolean goodBoy) {
    this.goodBoy = goodBoy;
  }

  @Override
  public void speak() {
    System.out.println("Barks at passing cars!");
  }

  @Override
  public void hunt() {
    System.out.println("Throw the ball and I'll fetch it.");
  }

}

