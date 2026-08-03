package Questions.RateLimiter.V1.Objects;

import java.time.Duration;
import java.time.LocalDateTime;

public class TokenBucket {
        int capacity;
        int refillperminute;
        int tokenpresent;
        LocalDateTime lastrefilltime;

        public TokenBucket(RateLimiterPolicy policy){
            this.capacity=policy.getCapacity();
            this.refillperminute=policy.getRefilsperminute();
            this.tokenpresent=capacity;
            this.lastrefilltime=LocalDateTime.now();
        }

        private void Refill(){
            if(tokenpresent==capacity){
                this.lastrefilltime=LocalDateTime.now();
                return;
            }

            LocalDateTime currenttime=LocalDateTime.now();
            long timeelapsed= Duration.between(lastrefilltime,currenttime).toMinutes();

            long tokenstorefill=0;
            if (timeelapsed > 0) {
             tokenstorefill=timeelapsed*refillperminute;
            }
            this.tokenpresent=(int)Math.min(capacity,tokenpresent+tokenstorefill);
            this.lastrefilltime=lastrefilltime.plusMinutes(timeelapsed);
        }

        public synchronized boolean consume(){
            Refill();

            if(this.tokenpresent<1){
                System.out.println("HTTP 429, retry after sometime");
                return false;
            }

            this.tokenpresent--;
            return true;

        }



}
