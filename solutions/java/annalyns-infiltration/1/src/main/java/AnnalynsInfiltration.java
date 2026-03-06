class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        // Scenario 1: Dog is present (Archer must be asleep)
        boolean scenarioWithDog = petDogIsPresent && !archerIsAwake;
        
        // Scenario 2: No dog (Prisoner is awake, both guards are asleep)
        boolean scenarioWithoutDog = !petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        
        return scenarioWithDog || scenarioWithoutDog;
    }
}
