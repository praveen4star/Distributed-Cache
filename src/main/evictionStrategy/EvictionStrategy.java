package main.evictionStrategy;

import main.cache.CacheEntry;

public interface EvictionStrategy<K, V> {
    K evict();
    void update(CacheEntry<K, V> entry);
}
