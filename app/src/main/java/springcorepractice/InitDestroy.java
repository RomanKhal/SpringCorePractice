package springcorepractice;

public interface InitDestroy {
    default void doInit(){
        System.out.println("Doing initialization " + this.getClass().getSimpleName());
    }
    default void doDestroy(){
        System.out.println("Doing destroy " + this.getClass().getSimpleName());
    }
}
