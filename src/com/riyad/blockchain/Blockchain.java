package com.riyad.blockchain;

import java.util.ArrayList;
import java.util.List;

public class Blockchain {
    private List<Block> blockchain;

    public Blockchain() {
        this.blockchain = new ArrayList<>();
    }

    public void addBlock(Block block){
        this.blockchain.add(block);
    }

    public List<Block> getBlockchain(){
        return this.blockchain;
    }

    public int size(){
        return this.blockchain.size();
    }

    @Override
    public String toString(){
        String blockChain = "";
        for(Block block:this.blockchain){
            blockChain +=block.toString()+"\n";
        }
        return blockChain;
    }
}
