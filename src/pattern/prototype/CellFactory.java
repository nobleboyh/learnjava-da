package pattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class CellFactory {

    private static final Map<Color, Cell> CELL_CACHE = new HashMap<>();

    public static Cell getCell(Color color){
        if (!CELL_CACHE.containsKey(color)){
            CELL_CACHE.put(color, new Cell(color));
        }
        return CELL_CACHE.get(color).clone();
    }
}

enum Color {
    BLACK,
    WHITE
}
