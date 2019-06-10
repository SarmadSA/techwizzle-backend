package com.techwizzle.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "GRAPHICS_CARD")
public class GraphicsCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;

    @Column(name = "RELEASE_PERIOD")
    private String releasePeriod;

    @Column(name = "AVERAGE_PRICE")
    private Integer averagePrice;

    private String referralLink;

    private Integer cudaCores;

    private Integer baseClock;

    private Integer boostClock;

    private Integer memoryClockSpeed;

    private String standardMemoryConfig;

    private Integer memoryBandwidth;

    //@ElementCollection
    //private List<Game> games = new ArrayList<>();

}