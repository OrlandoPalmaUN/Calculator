package core.model.storage;
import core.model.IOperation;
import java.util.ArrayList;
public class History {
    
    // Instancia Singleton
    private static History instance;
    
    // Atributos del History
    private ArrayList<String> operations;
    
    private History() {
        this.operations = new ArrayList<>();
    }
    
    public static History getInstance() {
        if (instance == null) {
            instance = new History();
        }
        return instance;
    }
    
    public void addOperation(String operation) {
        this.operations.add(operation);
    }

    public ArrayList<String> getOperations() {
        return operations;
    }
    
}
