package com.hackathon.iplbidding.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class BiddingSession {
    @Id
    private String id;
    private List<Player> playerList;
    private long topBid;
    private Bidder topBidder;
    private Player currentPlayer;
    private int currentRound;
    private Date startTime;
    private Date endTime;
}
