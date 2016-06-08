public class Ship extends Abstract_Ship {


    public Ship(int direction, int pipeNumber, int x, int y) {
        this.direction = direction;
        this.pipeNumber = pipeNumber;
        this.x = x;
        this.y = y;
        shoots = new int[pipeNumber];
    }


    @Override//переопределение - заменяем реализацию метода из родительского класса реализацией в дочернем
    public boolean checkShoot() {
        return false;
    }

    @Override
    public boolean putShip(int x, int y, int pipeNumber, int direction) {

       boolean result = false;

        if (direction == 0 && this.direction == 1)// 0 horizontal; 1 vertical
        {
           if (((x + pipeNumber) < (this.x - 1)) || ((x + 1 ) > this.x ))
             result = true;
        }
        else if (direction == 0 && this.direction == 0)
        {
            if (((x + pipeNumber) < (this.x - 1)) || ((x + 1 ) > this.x + this.pipeNumber ))
                result = true;
        }

        else  if (direction == 1 && this.direction == 1)
        {
            if (((x + pipeNumber) < (this.x - 1)) || ((x + 1 ) > this.x ))
                result = true;
        }
        else if (direction == 1 && this.direction == 0)
        {
            if (((x + pipeNumber) < (this.x - 1)) || ((x + 1 ) > this.x + this.pipeNumber ))
                result = true;
        }
        return result;
    }

}
