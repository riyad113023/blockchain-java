import com.riyad.blockchain.Block;
import com.riyad.blockchain.Blockchain;
import com.riyad.blockchain.Constants;
import com.riyad.blockchain.Miner;

public class Main {

    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();
        Miner miner = new Miner();

        Block block0 = new Block(0,"transaction 1", Constants.GENESIS_PREV_HASH);
        miner.mine(block0,blockchain);

        Block block1 = new Block(1,"transaction 2", blockchain.getBlockchain().get(blockchain.size()-1).getHash());
        miner.mine(block1,blockchain);

        Block block2 = new Block(2,"transaction 3", blockchain.getBlockchain().get(blockchain.size()-1).getHash());
        miner.mine(block2,blockchain);

        System.out.println("BlockChain:\n" + blockchain);
    }
}
