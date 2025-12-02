public class Roller {
    int value = 50;

    void changeRollerValue(char direction, int moveValue) {
        if(direction == 'R'){
            value = (value + moveValue) % 100;
        }else if(direction == 'L'){
            value = (value - moveValue + 100) % 100;
        }
    }
}
