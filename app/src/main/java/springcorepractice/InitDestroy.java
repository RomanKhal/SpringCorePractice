package springcorepractice;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public interface InitDestroy {
    @PostConstruct
    default void doInit(){
        System.out.println("Doing initialization " + this.getClass().getSimpleName());
    }
    @PreDestroy
    default void doDestroy(){
        System.out.println("Doing destroy " + this.getClass().getSimpleName());
    }
}
