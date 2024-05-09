package model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConversionRates {

    @SerializedName("USD")
    @Expose
    private Double usd;
    @SerializedName("ARS")
    @Expose
    private Double ars;
    @SerializedName("BOB")
    @Expose
    private Double bob;
    @SerializedName("BRL")
    @Expose
    private Double brl;
    @SerializedName("CLP")
    @Expose
    private Double clp;
    @SerializedName("COP")
    @Expose
    private Double cop;
    @SerializedName("MXN")
    @Expose
    private Double mxn;

    public Double getUsd() {
        return usd;
    }

    public void setUsd(Double usd) {
        this.usd = usd;
    }

    public Double getArs() {
        return ars;
    }

    public void setArs(Double ars) {
        this.ars = ars;
    }

    public Double getBob() {
        return bob;
    }

    public void setBob(Double bob) {
        this.bob = bob;
    }

    public Double getBrl() {
        return brl;
    }

    public void setBrl(Double brl) {
        this.brl = brl;
    }

    public Double getClp() {
        return clp;
    }

    public void setClp(Double clp) {
        this.clp = clp;
    }

    public Double getCop() {
        return cop;
    }

    public void setCop(Double cop) {
        this.cop = cop;
    }

    public Double getMxn() {
        return mxn;
    }

    public void setMxn(Double mxn) {
        this.mxn = mxn;
    }

    @Override
    public String toString() {
        return "ConversionRates{" +
                "usd=" + usd +
                ", ars=" + ars +
                ", bob=" + bob +
                ", brl=" + brl +
                ", clp=" + clp +
                ", cop=" + cop +
                ", mxn=" + mxn +
                '}';
    }
}