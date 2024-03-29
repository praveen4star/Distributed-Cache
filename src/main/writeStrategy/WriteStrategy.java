package main.writeStrategy;

public interface WriteStrategy<K, V> {
    void add(K key, V value);
    void update(K key, V value);
    V get(K key);
    void delete(K key);
}
