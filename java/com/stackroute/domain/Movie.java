package com.stackroute.domain;

public class Movie
{
  public Movie() {
  }
//reference of Actor class
  private Actor actor;

  //constructor
  public Movie(Actor actor) {
    this.actor = actor;
  }

  //setters and getters
  public Actor getActor () {
    return actor;
  }

  public void setActor (Actor actor){
    this.actor = actor;
  }

  @Override
  public String toString() {
    return "" + actor;
  }
}
