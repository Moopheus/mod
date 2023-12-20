public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FirstModMain.MOD_ID);

    public static final RegistryObject<Block> CORRUPT_COBBLESTONE = BLOCKS.register("corrupt_cobblestone",
            () -> new Block(Block.Properties.of(Material.STONE).strength(4f, 1200f).requiresCorrectToolForDrops().lightLevel((state) -> 1));
}
