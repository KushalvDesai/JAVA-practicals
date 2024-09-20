import java.nio.IntBuffer;

public class prac7_6{
    public static void main(String[] args) {
        product pizza = new product();
        product spaghetti = new product();
        producer K = new producer(pizza);
        consumer D = new consumer(spaghetti);
        K.start();
        D.start();
    }
}

class product extends Thread{
    static IntBuffer Product = IntBuffer.allocate(5);
    static synchronized public void CreateProduct(int x){
        if(x == 0){
            for(int i=1;i<5;i++){
                System.out.println(Product.put(i));
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        else{
            Product.flip();
            while(Product.hasRemaining()){
                System.out.println("CONSUME: "+Product.get());
            }
            Product.clear();
        }
        
    }
}

class producer extends Thread{
    product pasta;
    producer(product pasta){
        this.pasta = pasta;
    }
    public void run(){
        pasta.CreateProduct(0);
    }
}

class consumer extends Thread{
    product pasta;
    consumer(product pasta){
        this.pasta = pasta;
    }
    public void run(){
        pasta.CreateProduct(1);
    }
}