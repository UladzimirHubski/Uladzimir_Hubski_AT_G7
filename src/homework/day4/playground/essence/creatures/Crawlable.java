package homework.day4.playground.essence.creatures;

public interface Crawlable {
    default void crawl(String direction, int distance) {
        System.out.printf("I am , " + getClass().getName() + " my name is " + getName() + " and I am crawling to " + direction + " for " + distance + " units");
    }

}
