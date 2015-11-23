package me.ggikko.collect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Park Ji Hong, ggikko.
 */

@Component
public class GettingBatchBean {

    @Autowired
    CollectRepository collectRepository;

    @Scheduled(cron = "*/20 * * * * *")
    public void inputData() {
        CollectInfo collectInfo = new CollectInfo();
        collectInfo.setUrl("http://ggikko.com");
        collectInfo.setHtmlInfo("hello");
        collectRepository.save(collectInfo);
    }
}
