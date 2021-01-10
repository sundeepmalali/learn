package com.learn;

@FunctionalInterface
public interface Comparator<T> {

    public abstract int compare(T a, T b);
}
