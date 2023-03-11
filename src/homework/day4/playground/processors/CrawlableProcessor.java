package homework.day4.playground.processors;

import homework.day4.playground.essence.creatures.Crawlable;
import homework.day4.playground.essence.utils.DirectionGenerator;
import homework.day4.playground.essence.utils.DistanceGenerator;

public class CrawlableProcessor {
    public void runCrawlable(Crawlable crawlable) {
        int distance = DistanceGenerator.generateDistance();
        String direction = DirectionGenerator.generateDirection();
        this.runCrawlable(crawlable, direction, distance);
    }

    public void runCrawlable(CrawlableProcessor crawlable, String direction, int distance) {
        crawlable.runCrawlable(direction, distance);
    }

}
