package ra.edu.redis.commuticate;

import org.springframework.stereotype.Component;

@Component
public class RedisSubscriber {
    public void handlerPayment(String mess){
        // gọi khi có event đc gửi vào kênh Order-created
        System.out.println("Subcriber đã nhận được thông tin ... ");
        System.out.println("Mess : "+ mess);
    }
}
