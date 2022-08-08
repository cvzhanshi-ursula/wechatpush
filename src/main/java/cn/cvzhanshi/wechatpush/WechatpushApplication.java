package cn.cvzhanshi.wechatpush;

import cn.cvzhanshi.wechatpush.config.Pusher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class WechatpushApplication {

    public static void main(String[] args) {
        SpringApplication.run(WechatpushApplication.class, args);
    }


    @Scheduled(cron = "0 30 7 * * ?")
    public void goodMorning(){
        Pusher.push();
    }

}
