import org.apache.log4j.Logger;

public class OrderLogic {
    private static final Logger log = Logger.getLogger(OrderLogic.class);
    public void doOrder(){
        System.out.println("Заказ оформлен!");
        log.info("Это информационное сообщение!");
        addToCart();
    }

    private void addToCart() {
        System.out.println("Товар добавлен в корзину");
        log.error("Это сообщение ошибки");
    }
}
