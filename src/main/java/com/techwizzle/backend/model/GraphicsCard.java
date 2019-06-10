package com.techwizzle.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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

    @NotNull(message = "{graphicsCard.title.notNull}")
    @Size(min = 10, max = 70, message = "{graphicsCard.title.notNull}")
    private String title;

    @Size(min = 5, max = 30)
    private String shortTitle;

    @NotNull
    @Size(min = 4, max = 8)
    private String releasePeriod;

    private Integer averagePrice;

    @Size(min = 10, max = 1000)
    private String referralLink;

    private Integer cudaCores;

    private Integer baseClock;

    private Integer boostClock;

    private Integer memoryClockSpeed;

    @Size(min = 8, max = 15)
    private String standardMemoryConfig;

    private Integer memoryBandwidth;

    @Size(min = 10, max = 1000)
    private String imageLink;

    //@ElementCollection
    //private List<Game> games = new ArrayList<>();

}