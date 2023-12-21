public class SoilBlock extends Block {
    public SoilBlock(Block.Properties properties) {
        super(properties);
    }
    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
      Block plant = plantable.getPlant(world, pos.relative(facing)).getBlock();
      return true;
    }
}
