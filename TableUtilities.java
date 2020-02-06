
public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);

    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);

    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for (int row = 1; row<= tableSize; row ++){ 
            for (int col = 1; col <= tableSize ; col ++){
                if ( row * col < 10){
                    table += "  " + row * col + " |"; }   
                else if (( row * col > 9) && (row * col < 100)){
                    table += " " + row * col + " |"; } 
                else {
                    table +=  row * col + " |"; } 

            }
            table += "\n";
        }
        return table;    }
}
