
package ru.netology.smartHomeRadio;

public class Radio {
    //private int maxStation = 9;
    // private int minStation = 0;
    private int currentStation;
    // private int maxVolume = 100;
    //private int minVolume = 0;
    private int currentVolume;
    //public int currentStation;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void lessVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 100;
        }
    }

    public void moreVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }


}




