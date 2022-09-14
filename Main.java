package AdHm09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> idList;
        idList = new ArrayList<>();
        IdGenerator idGenerator = new IdGenerator(idList);
        IdConsumer idConsumer = new IdConsumer();
        IdSender idSender = new IdSender(idList, idConsumer);
    }
}
