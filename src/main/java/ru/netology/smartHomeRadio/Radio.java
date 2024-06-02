
package ru.netology.smartHomeRadio;

public class Radio {

    private int maxStation = 20;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentStation;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int numberStation) {
        // maxStation = minStation + numberStation - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void next() {
        if (currentStation >= 9) {
            setCurrentStation(minStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void prev() {
        if (currentStation <= minStation) {
            setCurrentStation(maxStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    /*public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMaxStation(int maxStation) {
        currentStation = maxStation;
    }

    public void setMinStation(int minStation) {
        currentStation = minStation;
    }*/

    /*public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }*/
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void lessVolume() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        }
    }

    public void moreVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        }
    }
}




