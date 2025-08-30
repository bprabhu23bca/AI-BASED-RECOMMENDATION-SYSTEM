package com.example.recommendation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class RecommendationSystem {

    // Data structure to hold user ratings
    private static Map<Integer, Map<Integer, Integer>> userRatings = new HashMap<>();

    public static void main(String[] args) {
        // Load the dataset
        loadData("/data.csv");

        // Show all users and their ratings
        System.out.println("User Ratings:");
        for (int user : userRatings.keySet()) {
            System.out.println("User " + user + " -> " + userRatings.get(user));
        }

        // Example: recommend products for user 1
        int targetUser = 1;
        System.out.println("\nRecommendations for User " + targetUser + ":");
        List<Integer> recommendations = recommendProducts(targetUser);
        for (int product : recommendations) {
            System.out.println("Product " + product);
        }
    }

    // Load dataset from resources folder
    private static void loadData(String fileName) {
        try {
            BufferedReader br = new BufferedReader(
                new InputStreamReader(RecommendationSystem.class.getResourceAsStream(fileName))
            );

            String line;
            br.readLine(); // skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int userId = Integer.parseInt(parts[0]);
                int productId = Integer.parseInt(parts[1]);
                int rating = Integer.parseInt(parts[2]);

                userRatings.putIfAbsent(userId, new HashMap<>());
                userRatings.get(userId).put(productId, rating);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Simple recommendation: recommend products highly rated by similar users
    private static List<Integer> recommendProducts(int targetUser) {
        Map<Integer, Integer> targetRatings = userRatings.get(targetUser);
        Set<Integer> recommended = new HashSet<>();

        for (int otherUser : userRatings.keySet()) {
            if (otherUser != targetUser) {
                for (Map.Entry<Integer, Integer> entry : userRatings.get(otherUser).entrySet()) {
                    int product = entry.getKey();
                    int rating = entry.getValue();

                    // If other user liked it (rating >= 4) and target user hasn't rated it
                    if (rating >= 4 && !targetRatings.containsKey(product)) {
                        recommended.add(product);
                    }
                }
            }
        }
        return new ArrayList<>(recommended);
    }
}