package org.shevtsovla.kotlincourse.lesson21

class Container<T> (val item: T) {}

class PairBox<T, N> (val pair: Pair<T, N>) {}

class LimitedContainer<T: Number> (val number: T) {}

interface Storage<T> {
    fun set (item: T)
    fun get (): T
}

interface Transformer<A, D> {
    fun transform(item: A): D
}

//fun <W> swap (list: List<W>, i1: Int, i2: Int): List<W> {}
//
//fun <M> second(list1: List<M>, list2: List<M>): List<M> {}
//
//fun <K, V> toMap(keys: List<K>, values: List<V>): Map<K, V> {}
