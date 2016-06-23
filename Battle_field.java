//Реализовать шаблон для игры «Морской бой»:
//Нужен класс для игрового поля(10х10). У игрового поля есть название(имя игрока) и набор кораблей разного типа.
//Есть четыре типа кораблей, которые отличаются по количеству труб. И соответственно занимают определенное количество ячеек.
// Размещать корабли можно по вертикали или по горизонтали.
//Игра делится на несколько этапов: расстановка кораблей, поочередное ведение стрельбы и определение победителя.
// При расстановке кораблей нужно проверять, чтобы корабли не уходили за контуры игрового поля и отстояли друг от друга минимум на одну клетку.
// При ведении стрельбы игроку предлагается выбрать ячейку, по которой будет произведен залп. После выбора этой ячейки игрок получает ответ в
// зависимости от своей результативности: Мимо, попал или потопил.
// Игра заканчивается, когда после очередного потопления у одного из противников не остается кораблей.
// Подсказка: корабли нужно отнаследовать от одного абстрактного класса. Всё, что может происходить с кораблем лучше реализовать в классе корабле.
// В том числе и проверку на попадание. Так будет легче проверять – по массиву игрового поля.

public class Battle_field {


    int side = 10;
    int shipsQuantity = 10;
    int[][] field = new int[side][side];
    String playerName;

    Ship[] ships = new Ship[shipsQuantity];

    public Battle_field(String playerName) {
        this.playerName = playerName;
        field[0][0] = 10;
        field[2][0] = 20;
        field[2][1] = 20;
        field[1][0] = 1;

    }

    public void generateField() {
        int x, y, direction, pipeNumber;

        for (int i = 0; i < shipsQuantity; i++) {
            do {
                ships [i] = new Ship();
                x = (int) (Math.random() * side);
                y = (int) (Math.random() * side);
                direction = (int) (Math.random() * 2);
                if (i == 0)
                    pipeNumber = 4;
                else if (i <= 2) // 1 2 and ! 0
                    pipeNumber = 3;
                else if (i <= 5)//
                    pipeNumber = 2;
                else
                    pipeNumber = 1;

            } while (ships[i].putShip(x, y, pipeNumber, direction, field) != true);
        }
    }


    public void displayField() {
        for (int y = 0; y < side; y++) {
            for (int x = 0; x < side; x++) {
                if (field[y][x] == 0)
                    System.out.print(" ");
                else if (field[y][x] == 1)
                    System.out.print("*");
                else if (field[y][x] >= 20)
                    System.out.print("@");
                else System.out.print("~");
            }

            System.out.println();
        }
//        for (int i = 0; i < side; i++)
//        System.out.println(Arrays.toString(field[i]));
    }
}
/*
* 0 - empty cell
* 1 - shot empty cell
* 10 - unshot cell of the 1st 1pipe ship
* 11 - unshot cell of the 2nd 1pipe ship
* 12 - unshot cell of the 3rd 1pipe ship
* 13 - unshot cell of the 4th 1pipe ship
* 14 - unshot cell of the 1st 2pipe ship
* 15 - unshot cell of the 2nd 2pipe ship
* 16 - unshot cell of the 3rd 2pipe ship
* 17 - unshot cell of the 1st 3pipe ship
* 18 - unshot cell of the 2nd 3pipe ship
* 19 - unshot cell of the 1st 4pipe ship
* 20 - shot cell of the 1st 1pipe ship
* 21 - shot cell of the 2nd 1pipe ship
* 22 - shot cell of the 3rd 1pipe ship
* 23 - shot cell of the 4th 1pipe ship
* 24 - shot cell of the 1st 2pipe ship
* 25 - shot cell of the 2nd 2pipe ship
* 26 - shot cell of the 3rd 2pipe ship
* 27 - shot cell of the 1st 3pipe ship
* 28 - shot cell of the 2nd 3pipe ship
* 29 - shot cell of the 1st 4pipe ship
* */