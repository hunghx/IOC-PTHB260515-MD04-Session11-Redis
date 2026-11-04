package ra.edu.redis.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Cacheable(value = "products", key = "#id")
    // Lưu lại kết quả trả về của phương thức dưới key có đinh dạng : products::id
    public String getProductById(String id) {
        System.out.println("Gọi xuống DB thực hiện truy vấn ........");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Product Details with ID: " + id;
    }
    // làm sao để cứ sao 10p thì xóa cache đọc lại từ db
}
