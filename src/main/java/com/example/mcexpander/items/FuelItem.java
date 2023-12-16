public class FuelItem extends Item {
    private final int burnTicks;
    public FuelItem(Properties properties, int burnTimeInTicks) {
        super(properties);
        this.burnTicks = burnTimeInTicks;
    }
}
