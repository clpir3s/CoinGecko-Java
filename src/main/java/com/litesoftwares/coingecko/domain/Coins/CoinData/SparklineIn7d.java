package com.litesoftwares.coingecko.domain.Coins.CoinData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SparklineIn7d implements Serializable {
    private static final long serialVersionUID = -2169293150219020249L;
    @JsonProperty("price")
    private List<Double> price;

}
