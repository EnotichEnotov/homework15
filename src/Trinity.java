public class Trinity <T extends Comparable> {
    private T first;
    private T second;
    private T third;

    public Trinity(T first, T second, T third){
        this.first = first;
        this.second = second;
        this.third = third;
        sort();
    }
    public void sort(){
        T t;
        if (first.compareTo(second) < 0){
            t = second;
            second = first;
            first = t;
        }
        if (second.compareTo(third) < 0){
            t = third;
            third = second;
            second = t;
        }
        if (first.compareTo(third) < 0){
            t = third;
            third = first;
            first = t;
        }

    }

    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }
    public T getThird(){
        return third;
    }


    public void SetFirst(T first){
        this.first = first;
        sort();
    }
    public void SetSecond(T first){
        this.second = second;
        sort();
    }
    public void SetThird(T first){
        this.third = first;
        sort();
    }

    @Override
    public String toString(){
        return "Убойная тройня Горнера" + first + " " +  second + " " +  third;
    }
}
