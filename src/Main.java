import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("poem.txt"), "Cp1251"));
            String line = reader.readLine();
            Queue <String> q = new LinkedList<>();
            while(line != null) {
                q.add(line);
                line = reader.readLine();
            }
            QueueOut(q);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void QueueOut(Queue <String> q) throws InterruptedException {
        while(q.peek() != null) {
            System.out.println(q.peek());
            Thread.sleep((int)(1000 + Math.random() * 2001));
            q.poll();
        }
    }
}