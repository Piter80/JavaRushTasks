package com.javarush.task.task27.task2712.ad;

import com.javarush.task.task27.task2712.ConsoleHelper;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * у каждого планшета будет свой объект менеджера, который будет подбирать оптимальный набор роликов и их последовательность для каждого заказа.
 */
public class AdvertisementManager {
    private final AdvertisementStorage storage = new AdvertisementStorage();
    private int timeSeconds;
    public List<Advertisement>  adList;

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds;
    }




}