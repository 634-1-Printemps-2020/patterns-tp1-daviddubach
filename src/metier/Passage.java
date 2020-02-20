package metier;

import java.util.Objects;

public class Passage {
    Point from;
    Point to;

    public Passage(Point from, Point to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Passage{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passage passage = (Passage) o;
        return from.equals(passage.from) &&
                to.equals(passage.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
