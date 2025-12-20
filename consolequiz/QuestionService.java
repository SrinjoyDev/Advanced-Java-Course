package consolequiz;

import java.util.Scanner;

public class QuestionService {
  Question[] questions = new Question[5]; // we need 5 ques so 5 references to the object not actually an object.

  // user input array
  String[] userInput = new String[5];

  public QuestionService() {

    questions[0] = new Question(
        1, "which of the language was founded in 1995 ?", new String[] { "cpp", "python", "java", "go" }, "java");

    questions[1] = new Question(
        2, "what is the language that is used by most enterprise companies ?",
        new String[] { "java", "go", "Rust", "javaScript" }, "java");

    questions[2] = new Question(
        3, "Is java an OOP language", new String[] { "yes", "no" }, "yes");

    questions[3] = new Question(
        4, "dosent java support OOP ?", new String[] { "yes", "no" }, "yes");

    questions[4] = new Question(
        5, "what is full form of G.C ?",
        new String[] { "Garbage Chaneger", "Garbage center", "Given Change", "Garbage Collector" },
        "Garbage Collector");

  }

  public void playQuiz() {
    // display whatever questions that are there:

    Scanner sc = new Scanner(System.in);
    System.out.println("QUESTIONS PRESENT ARE : ");

    // OLD FOR LOOP
    // for(int i = 0 ; i < questions.length ; i ++){
    // System.out.println(questions[i].getQuestion() + " ");
    // }
    // System.out.println();

    // //using advanced loop>
    // for (Question q: questions){
    // System.out.println(q); //it calls internally toString() , what the toString
    // does is , it makes the hash values to toString
    // }
    //

    System.out.println("welcome to the quiz game");
    System.out.println();
    System.out.println("what is ur name ??");
    String userName = sc.nextLine();
    int currentScore = 0;
    User participant = new User(userName, currentScore);

    System.out.println("welcome " + userName + " lets start the quiz , here are ur questions");
    System.out.println();

    int i = 0;
    for (Question q : questions) {

      System.out.println("question number : " + q.getId());
      System.out.println(q.getQuestion());

      // print the options
      // so options are array also so we have to have an inner loop to print the
      // options
      /// one of the methods
      // System.out.println("Options : " + Arrays.toString(q.getOptions()));
      //
      // or if u want to have more control: like pretty print or some stuff u want to
      // do , that is print in ur way
      String[] options = q.getOptions();

      System.out.println("Options : ");
      for (String o : options) {
        System.out.println(o);
      }
      System.out.println();

      // take user input::
      System.out.println("Please enter your answer exactly as the option u think that is correct!");
      System.out.println();
      userInput[i] = sc.nextLine(); // take user input for current questions

      // check if user got it right or wrong
      if (userInput[i].equalsIgnoreCase(q.getAnswer())) {
        // increment user score count
        currentScore += 10;
        // update user currentScore
        participant.setScore(currentScore);
      }

      // increment the question index as user has answered it
      i++;
    }

    System.out.println();
    System.out.println("your inputs ::");
    System.out.println();

    // display user input:
    for (String input : userInput) {
      System.out.println(input);
    }

    System.out.println();

    // show user score
    System.out.println("your score is : " + currentScore);

    // close the scanner to avoid resource leak
    sc.close();
  }
}
