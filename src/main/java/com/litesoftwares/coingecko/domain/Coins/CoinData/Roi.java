package com.litesoftwares.coingecko.domain.Coins.CoinData;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Roi implements Serializable {
    private static final long serialVersionUID = 1669293150219020249L;
    @JsonProperty("times")
    private float times;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("percentage")
    private float percentage;

}
