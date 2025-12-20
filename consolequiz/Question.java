package consolequiz;

import java.util.Arrays;

public class Question {
  private int id;
  private String question;
  private String options[];
  protected String answer;

  // constructor
  public Question(
      int id,
      String question,
      String[] options,
      String answer) {
    this.id = id;
    this.question = question;
    this.options = options;
    this.answer = answer;
  }

  // gettters
  public int getId() {
    return id;
  }

  public String getQuestion() {
    return question;
  }

  public String[] getOptions() {
    return options;
  }

  public String getAnswer() {
    return answer;
  }

  // setters
  public void setId(int id) {
    this.id = id;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public void setOptions(String[] options) {
    this.options = options;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  // to string method
  @Override
  public String toString() {
    return "Question [id=" + id + ", question=" + question + ", options=" + Arrays.toString(options) + ", answer="
        + answer + "]";
  }
}
