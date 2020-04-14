package com.riyad.blockchain;

import java.util.Date;

public class Block {

    private int id;
    private int nonce;
    private long timeStamp;
    private String hash;
    private String previousHash;
    private String transaction;

    public Block(int id, String transaction,  String previousHash) {
        this.id = id;
        this.previousHash = previousHash;
        this.transaction = transaction;
        this.timeStamp = new Date().getTime();
        generateHash();
    }

    public void generateHash(){
        String dataToHash = Integer.toString(id)+previousHash+Long.toString(timeStamp)+Integer.toString(nonce)+transaction.toString();
        String hashValue = SHA256Helper.generateHash(dataToHash);
        this.hash = hashValue;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public void incrementNonce(){
        this.nonce++;
    }

    @Override
    public  String toString(){
        return id+ " "+ transaction+" "+previousHash;
    }
}
