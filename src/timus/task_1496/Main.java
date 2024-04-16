package timus.task_1496;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Map<String, Integer> accounts = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String account = scanner.next();
            accounts.put(account, accounts.getOrDefault(account, 0) + 1);
        }

        List<String> spammerAccounts = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : accounts.entrySet()) {
            if (entry.getValue() > 1) {
                spammerAccounts.add(entry.getKey());
            }
        }

        for (String account : spammerAccounts) {
            System.out.println(account);
        }
    }
}
