import java.util.Arrays;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {
    public static double doAverage(int[] salary) {
        Arrays.sort(salary);
        return Arrays.stream(salary, 1, salary.length - 1)
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        int[] nums = {4, 5};
        System.out.println(doAverage(nums));
        System.out.println(Arrays.toString(nums));

    }
}
