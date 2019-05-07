package com.github.VladCebula.Lessons.Polymorphism;

public abstract class Vertebrate extends Chordate {

  @Override
  public String getSubtype() {
    return "Vertebrate";
  }

  public boolean hasBones() {//info example
    return true;
  }
}//kręgowce subtype
