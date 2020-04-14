package com.riyad.blockchain;

public class Miner {
    private Double reward=0.0;

    public Double getReward() {
        return this.reward;
    }

    public void setReward(Double reward) {
        this.reward = reward;
    }

    public void mine(Block block, Blockchain blockchain){
        while (notGoldenHash(block)){
            block.generateHash();
            block.incrementNonce();
        }

        System.out.println(block + " has just mined");
        System.out.println(" Hash is:"+ block.getHash());

        blockchain.addBlock(block);
        reward+=Constants.MINER_REWARD;

    }

    private boolean notGoldenHash(Block block) {
        String leadingZeros = new String(new char[Constants.DIFFICULTY]).replace('\0','0');
        return !block.getHash().substring(0,Constants.DIFFICULTY).equals(leadingZeros);
    }
}
