package ra.edu.redis.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.edu.redis.commuticate.RedisPublisher;
import ra.edu.redis.service.ProductService;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {
    private final ProductService productService;
    private final RedisPublisher publisher;
    @GetMapping("/products/{id}")
    public String getProductById(@PathVariable String id) {
        publisher.sendMessage();
        return productService.getProductById(id);
    }
}
