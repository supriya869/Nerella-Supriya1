import java.util.*;

 class Problem4 {

    public static Map<Integer, Integer> countMultiples(List<Integer> numbers) {
        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (int d = 1; d <= 9; d++) {
            result.put(d, 0);
        }
        for (int n : numbers) {
            for (int d = 1; d <= 9; d++) {
                if (n % d == 0) {
                    result.put(d, result.get(d) + 1);
                }
            }
        }
        return result;
    }

    public static List<Integer> parseList(String line) {
        String[] parts = line.split("[,\\s]+");
        List<Integer> list = new ArrayList<>();
        for (String p : parts) {
            if (p.trim().isEmpty()) continue;
            try {
                list.add(Integer.parseInt(p.trim()));
            } catch (NumberFormatException e) {
                // skip invalid tokens or optionally report
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by commas or spaces (example: 1,2,8,9,12):");
        String line = sc.nextLine();
        List<Integer> numbers = parseList(line);
        Map<Integer, Integer> res = countMultiples(numbers);
        System.out.println(res); // prints like {1=11, 2=8, ...}
        sc.close();
    }
}

