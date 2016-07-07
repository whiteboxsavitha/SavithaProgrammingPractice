package com.algoridum;
public class Entry {
        private String username;
        private int count;
        private boolean inHeap;


        private Entry(String username) {
            this.username = username;
        }

        @Override
        public String toString() {
            return username + "(" + count + ")";
        }
    }

    private static final Comparator<Entry>  MIN_COMPARATOR = new Comparator<Entry>() {

        @Override
        public int compare(Entry o1, Entry o2) {
            return o1.count - o2.count;
        }
    };

    private static final Comparator<Entry>  MAX_COMPARATOR = new Comparator<Entry>() {

        @Override
        public int compare(Entry o1, Entry o2) {
            return o2.count - o1.count;
        }
    };

    private List<String> getMaxUsernames(String str, int k) {
        String[] users = str.split(",");
        Map<String, Entry> map = new HashMap<>();
        PriorityQueue<Entry> minHeap = new PriorityQueue<>(k, MIN_COMPARATOR);

        for (String user : users) {
            Entry entry = map.get(user);
            if (entry == null) {
                entry = new Entry(user);
                map.put(user, entry);
            }
            entry.count++;
            if (minHeap.size() < k) {
                minHeap.add(entry);
                entry.inHeap = true;
            } else if (entry.inHeap) {
                minHeap.remove(entry);
                minHeap.add(entry);
            } else if (entry.count > minHeap.peek().count) {
                minHeap.poll().inHeap = false;
                minHeap.add(entry);
                entry.inHeap = true;
            }
        }

        // Include usernames with the same count but use a binary heap here in order to to sort the results as well.
        int min = minHeap.peek().count;
        PriorityQueue<Entry> maxHeap = new PriorityQueue<>(k, MAX_COMPARATOR);
        for (Map.Entry<String, Entry> e: map.entrySet()) {
            if (e.getValue().count >= min) {
                maxHeap.add(e.getValue());
            }
        }

        List<String> result = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            result.add(maxHeap.poll().toString());
        }

        return result;
    }
}