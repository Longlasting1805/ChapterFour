import ChapterFiveExamples.AutoPolicy;

public class AutoPolicyObject {
    public static void main(String[] args) {
//        create two autoPolicy Object
        AutoPolicy policy1 =
                new AutoPolicy(111111111,"Toyota Camry", "NJ");
        AutoPolicy policy2 =
                new AutoPolicy(22222222,"Ford","NY");
//        display whether each policyIsInANoFaultState
                  policyInNoFaultState(policy1);
                  policyInNoFaultState(policy2);
    }

//        method that displays whether an auto-policy
//          is in a state with no-fault auto insurance
    private static void policyInNoFaultState(AutoPolicy policy) {
        System.out.println("The Auto Policy:");
        System.out.printf("Account#:%d; Car: %s%n State %s %s%n A No Fault State %n%n",policy.getAccountNumber(),policy.getMakeAndModel(),policy.getState(),
                (policy.isNoFaultState() ? "is": "is not"));

    }
//         



}
