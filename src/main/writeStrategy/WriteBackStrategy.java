package main.writeStrategy;

public class WriteBackStrategy<K, V> implements WriteStrategy<K, V>{

        @Override
        public void add(K key, V value) {

        }

        @Override
        public void update(K key, V value) {

        }

        @Override
        public V get(K key) {
            return null;
        }

        @Override
        public void delete(K key) {

        }
}
