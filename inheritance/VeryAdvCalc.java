
//multi level inheritancec.
//because advCalc inherits calc ,
//veryadvcalc inherits advCalc and advCalc inherits calc.
public class VeryAdvCalc extends AdvCalc {

  // powere
  public double pow(int n1, int n2) {
    return Math.pow(n1, n2);
  }
}
