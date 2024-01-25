package main.writeStrategy;

public class WriteStrategyFactory<K, V> {

        public WriteStrategy<K,V> getWriteStrategy(WriteStrategyType writeStrategyType) {
            return switch (writeStrategyType) {
                case WRITE_THROUGH -> new WriteThroughStrategy<K, V>();
                case WRITE_BACK -> new WriteBackStrategy<K, V>();
                default -> null;
            };
        }
}
