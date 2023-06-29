package Redis;

import java.util.List;

import redis.clients.jedis.Jedis;

public class redis {
    public static void main(String[] args) {
        // Kết nối tới Redis server
        Jedis jedis = new Jedis("localhost", 6379);

        // Gửi tin nhắn
        jedis.lpush("messages", "Hello world 12345");

        // Nhận tin nhắn
        List<String> message = jedis.brpop(0, "messages");
        if (!message.isEmpty()) {
            System.out.println("Received message: " + message.get(1));
        }

        // Đóng
        jedis.close();
    }
}
