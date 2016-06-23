public class Ship extends Abstract_Ship {

    public Ship() {
    }

    public Ship(int direction, int pipeNumber, int x, int y) {//координата левой верхней точки
        this.direction = direction;
        this.pipeNumber = pipeNumber;
        this.x = x;
        this.y = y;
        shoots = new int[pipeNumber];
    }


    @Override//переопределение - заменяем реализацию метода из родительского класса реализацией в дочернем
    public boolean checkShoot() {
        return false;
    }// check shooting the target ship

    @Override
    public boolean putShip(int x, int y, int pipeNumber, int direction, int [][] field) {

       boolean result = false;
        int i;
        if (y + (direction == 1 ? pipeNumber : 0) > Math.sqrt(field.length) || (x + (direction == 0 ? pipeNumber : 0)) >  Math.sqrt(field.length))
            result = false;
        else {
            for (i = 0; i < pipeNumber; i++) {
                if (field[y + (direction == 1 ? i : 0)][x + (direction == 0 ? i : 0)] != 0)
                    break;
            }
            if (i == pipeNumber)
                result = true;
        }
        return result;
    }

}
