package Questions.RateLimiter.V1.Objects;

public class RateLimiterPolicy {
    int capacity;
    int refilsperminute;

    public RateLimiterPolicy(int capacity,int refilsperminute){
        this.capacity=capacity;
        this.refilsperminute=refilsperminute;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRefilsperminute() {
        return refilsperminute;
    }


}
