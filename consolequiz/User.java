package consolequiz;

public class User {
  private String name;
  private int score;

  // constuctor
  public User(String name, int score) {
    this.name = name;
    this.score = score;
  }

  // getters
  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  // setters
  public void setScore(int score) {
    this.score = score;
  }

  public void setName(String name) {
    this.name = name;
  }

}
