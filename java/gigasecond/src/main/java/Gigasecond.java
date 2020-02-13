import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    long gigasecond = 1000000000;

    //find nedenstående.
    long yearFound;
    long monthFound;
    long dayOfMonthFound;
    long hourFound;
    long minutesFound;
    long secondsFound;

    LocalDate localDate;
    LocalDateTime localDateTime;

    Gigasecond(LocalDate moment) {
        this.localDate = moment;
    }

    Gigasecond(LocalDateTime moment) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    LocalDateTime getDateTime() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    void calcGigaSecond(){
    
    }

}