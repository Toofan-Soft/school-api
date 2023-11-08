package com.toofan.soft.school.api.comon;

//public record Phone(
//        int typeId,
//        long number
//) {}

import java.util.Objects;

public final class Phone {
    private final int typeId;
    private final long number;

    public Phone(
            int typeId,
            long number
    ) {
        this.typeId = typeId;
        this.number = number;
    }

    public int typeId() {
        return typeId;
    }

    public long number() {
        return number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Phone) obj;
        return this.typeId == that.typeId &&
                this.number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId, number);
    }

    @Override
    public String toString() {
        return "Phone[" +
                "typeId=" + typeId + ", " +
                "number=" + number + ']';
    }
}
