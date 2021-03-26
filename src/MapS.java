public interface MapS<K, V> {
    
        /**
         * @param key serch key
         * @return key
         */
        public abstract boolean containsKey(K key);
    
        /**
         * @param value serch value
         * @return value
         */
        public abstract boolean containsValue(V value);
    
        /**
         * @param key key to add 
         * @param value value to add
         * @return value added 
         */
        public abstract V put(K key, V value);
    
        /**
         * @param index index of the key
         * @return key
         */
        public abstract K getKey(int index);
    
        /**
         * @param key key
         * @return value
         */
        public abstract V get(K key);
    
}
