package pacakages.db;

class databaseConnection {
  String ConnectionString;
  String Password;

  public databaseConnection(
      String ConnectionString,
      String Password) {
    String madeDbConnection = ConnectionString + Password;
    System.out.println("connection with database done");
  }
}
