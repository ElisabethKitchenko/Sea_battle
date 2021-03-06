//Реализовать шаблон для игры «Морской бой»:
//Нужен класс для игрового поля(8х8). У игрового поля есть название(имя игрока) и набор кораблей разного типа.
//Есть четыре типа кораблей, которые отличаются по количеству труб. И соответственно занимают определенное количество ячеек.
// Размещать корабли можно по вертикале или по горизонтали.
//Игра делится на несколько этапов: расстановка кораблей, поочередное ведение стрельбы и определение победителя.
// При расстановке кораблей нужно проверять, чтобы корабли не уходили за контуры игрового поля и отстояли друг от друга минимум на одну клетку.
// При ведении стрельбы игроку предлагается выбрать ячейку, по которой будет произведен залп. После выбора этой ячейки игрок получает ответ в
// зависимости от своей результативности: Мимо, попал или потопил.
// Игра заканчивается, когда после очередного потопления у одного из противников не остается кораблей.
// Подсказка: корабли нужно отнаследовать от одного абстрактного класса. Всё, что может происходить с кораблем лучше реализовать в классе корабле.
// В том числе и проверку на попадание. Так будет легче проверять – по массиву игрового поля.

public class Sea_battle {

    public static void main(String[] args) {
        Battle_field a = new Battle_field("Mark Smith");
        a.displayField();
        a.generateField();
        a.displayField();
    }
}
