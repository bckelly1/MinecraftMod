package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BrianBlock extends Block{

    public BrianBlock(){
        super(Material.ROCK);
        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }
}
