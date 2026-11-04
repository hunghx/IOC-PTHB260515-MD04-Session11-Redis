package ra.edu.redis.commuticate;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RedisPublisher {
    public final StringRedisTemplate stringRedisTemplate;
    public void sendMessage() {
        stringRedisTemplate.convertAndSend("order-created", "Xin chào , đơn hàng của bạn đã được đặt");
    }
}
