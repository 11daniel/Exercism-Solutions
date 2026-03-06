public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
     public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int x){
        return expectedMinutesInOven() - x;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int x){
        return 2 * x;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int x, int y){
        return preparationTimeInMinutes(x) + y;
    }
}
