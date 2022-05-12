package oop.labor12.labor12_3;

import java.util.Objects;

public class Mark {
    private Subject tant;
    private double mark;

    public Mark(Subject tant, double mark) {
        this.tant = tant;
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark1 = (Mark) o;
        return tant == mark1.tant;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tant);
    }
}
