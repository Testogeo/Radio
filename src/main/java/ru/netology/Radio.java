package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationLimit = 20;


    public Radio(int stationLimit) {
        this.stationLimit = stationLimit;
    }

    public Radio() {
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation <= 19 ) {
            if (newStation >= 0) {

                currentStation = newStation;
            }
        }
    }

    public void nextStation() {
        if (currentStation == 19) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void previousStation() {
        if (currentStation == 0) {
            currentStation = 19;
        } else {

            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0 || newVolume > 100) {
            return;
        }
        this.currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}
