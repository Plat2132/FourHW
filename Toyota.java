package HomeWork;

import java.util.Objects;

public class Toyota extends Taxi {
int masxSpeed = 170;
public String get(){
    return " UBER X";
}
public String get(String simple){
    return "simple";
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toyota toyota = (Toyota) o;
        return masxSpeed == toyota.masxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(masxSpeed);
    }
}
