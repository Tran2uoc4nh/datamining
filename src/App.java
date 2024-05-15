import Preprocessing.Preprocessing;

public class App {
    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Users\\Admin\\Desktop\\data mining\\project\\src\\Data\\wind_dataset.csv";
        Preprocessing p = new Preprocessing(filePath);
        p.start();

    }
}
