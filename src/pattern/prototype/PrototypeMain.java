package pattern.prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Computer origin = new Computer("12","Window");

        long time1;

        time1 = System.nanoTime();
        Computer clone = origin.clone();
        System.out.println("Cloning take : " + (System.nanoTime() - time1));

        time1 = System.nanoTime();
        Computer newOne = new Computer(origin.getName(), origin.getOs());
        System.out.println("New take : " + (System.nanoTime() - time1));


        //Create multiple Cell
        Cell[] cells = new Cell[10];
        for(int i = 0; i < 10; i++){
            if(i % 2 ==0){
                cells[i] = CellFactory.getCell(Color.BLACK);
            }else{
                cells[i] = CellFactory.getCell(Color.WHITE);
            }
        }

        System.out.println(cells[0]);
        System.out.println(cells[2]);
    }
}
