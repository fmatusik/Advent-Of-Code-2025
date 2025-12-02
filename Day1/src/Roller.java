public class Roller {
    int value = 50;

    void changeRollerValue(char direction, int moveValue) {
        if(direction == 'R'){
            value = (value + moveValue) % 100;
        }else if(direction == 'L'){
            value = (value - moveValue + 100) % 100;
        }
    }


    //for part 2
    int howManyTimesRollerGoesThroughZero(char direction, int moveValue) {
        if (direction == 'R') {
            return (value + moveValue) / 100;
        } else {
            int toZero = (value == 0) ? 100 : value;
            return (moveValue + toZero - 1) / 100;
        }
    }
}
