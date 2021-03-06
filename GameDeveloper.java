public class GameDeveloper implements RatingInterface {

    public String GameName;
    public int hourOfDevelop;
    public String Genre;
    public int GameEvaluation;

    public GameDeveloper(){

    }

    public GameDeveloper(String GameName, int hourOfDevelop, String Genre, int GameEvaluation){
        this.GameName = GameName;
        this.Genre = Genre;
        this.hourOfDevelop = hourOfDevelop;
        this.GameEvaluation = GameEvaluation;
    }


    @Override
    public void rating() {
       if(GameEvaluation >= 1 && GameEvaluation <= 2) {System.out.println("Work HARDER!!!");}
       if(GameEvaluation >= 3 && GameEvaluation <= 4) {System.out.println("Good but not enough");}
       if(GameEvaluation >= 5) { System.out.println("Bellissimo!!!");}
    }

    @Override
    public String toString() {
        return "Developer{" +
                "Name of the Game=" + GameName +
                ", Genre=" + Genre +
                ", hourOfDevelop=" + hourOfDevelop +
                ", Rating=" + GameEvaluation +
                '}';
    }
}

