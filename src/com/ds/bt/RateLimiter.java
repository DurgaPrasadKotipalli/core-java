package com.ds.bt;

import java.util.*;

public class RateLimiter {
    private static final int MAX_REQUESTS = 3;
    private static final int INTERVAL = 10; // in seconds

    Map<Integer, Map<Integer, Integer>> clientRequests;

    public RateLimiter() {
        this.clientRequests = new HashMap<>();
    }

    public int[] processRequests(int[] clientIds, int[] timestamps) {
        int[] result = new int[clientIds.length];

        for (int i = 0; i < clientIds.length; i++) {
            int clientId = clientIds[i];
            int timestamp = timestamps[i];

            // Initialize request count for the client if it's not already in the map
            if (!clientRequests.containsKey(clientId)) {
                clientRequests.put(clientId, new HashMap<Integer, Integer>());
            }

            // Get the request count map for the client


            Map<Integer, Integer> requestCount = clientRequests.get(clientId);

            // Remove old timestamps
            for (Integer ts : new HashMap<Integer, Integer>(requestCount).keySet()) {
                if (timestamp - ts >= INTERVAL) {
                    requestCount.remove(ts);
                }
            }


            // Increment the request count for the current timestamp
            requestCount.put(timestamp, requestCount.containsKey(timestamp) ? requestCount.get(timestamp) + 1 : 1);
            // requestCount.put(timestamp, requestCount.getOrDefault(timestamp, 0) + 1);


            // Check if the request count exceeds the limit
            int totalRequests = 0;
            for (Integer count : requestCount.values()) {
                totalRequests += count;
            }
            result[i] = totalRequests <= MAX_REQUESTS ? 1 : 0;


        }
        return result;
    }

    public static void main(String[] args) {
        RateLimiter limiter = new RateLimiter();
        int[] clientIds  = {1, 1, 2,  2,  1,  1,  1,  1,  1, 1, 1};
        int[] timestamps = {1, 2, 2, 11, 12, 13, 14, 19, 25,26, 27};

        int[] result = limiter.processRequests(clientIds, timestamps);

        System.out.println(Arrays.toString(result));
    }
}

