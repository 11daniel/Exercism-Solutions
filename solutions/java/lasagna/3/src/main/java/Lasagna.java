public class Lasagna {
     public int expectedMinutesInOven(){
        return 40;
    }
    public int remainingMinutesInOven(int x){
        return expectedMinutesInOven() - x;
    }
    public int preparationTimeInMinutes(int x){
        return 2 * x;
    }
    public int totalTimeInMinutes(int x, int y){
        return preparationTimeInMinutes(x) + y;
    }
}
