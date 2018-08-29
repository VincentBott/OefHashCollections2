package com.company;

import java.util.Objects;

public class BankRekening {

    private String rekeningnummer;
    private int saldo;

    public BankRekening(String rekeningnummer) {
        this.rekeningnummer = rekeningnummer;
    }

    public String getRekeningnummer() {
        return rekeningnummer;
    }


    public int getSaldo() {
        return saldo;
    }

    public void storten(int bedrag){
        saldo += bedrag;
    }

    public void afhalen(int bedrag){
        saldo -= bedrag;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankRekening that = (BankRekening) o;
        return Objects.equals(rekeningnummer, that.rekeningnummer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rekeningnummer);
    }
}