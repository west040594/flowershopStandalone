package com.accenture;

import com.accenture.fe.ws.ProductStockWebService;
import com.accenture.fe.ws.ProductStockWebServiceImplService;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class App 
{
    public static void main( String[] args )
    {
        Timer timer = new Timer();
        timer.schedule( new TimerTask(){
            public void run(){
                System.out.println("Увелечение цветок на " + increaseFlowers());
            }
        },0,  60 * 10 * 1000 ); // 10 min.
    }

    private static int increaseFlowers() {
        ProductStockWebServiceImplService service = new ProductStockWebServiceImplService();
        ProductStockWebService sei = service.getProductStockWebServiceImplPort();
        Random randNumber = new Random();
        int flowerCount =  randNumber.nextInt((30 - 10) + 1) + 10;;
        sei.increaseProductStockSize(flowerCount);
        return flowerCount;
    }
}
