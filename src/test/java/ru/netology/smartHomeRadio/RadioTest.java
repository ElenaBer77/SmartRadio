
package ru.netology.smartHomeRadio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    //Radio radio = new Radio(0, 9, 0, 100);

    @Test
    public void shouldSetStation() { //установка станции
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void shouldSetToMaxStations() { //устанвка максимальной станции
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldSetToMinStation() { //установка минимальной станции
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setCurrentStation(0);
        //int expected = 0;
        //int actual = radio.getCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setValueBelowMinimumStation() { //установка ниже минимальной станции
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void setValueAboveMaximumStation() { //установка выше максимальной станции
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void nextStation() { //следующая станция через next
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.next();
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void stationAboveMaxCurrentStation9() { //переключение через кнопку next, выше max
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void stationAboveMaxCurrentStation10() { //переключение выше max
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void ButtonPrevCurrentStation0() { //переключение через кнопку prev со станции 0
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void ButtonPrevCurrentStation1() { //переключение через кнопку prev со станции 0
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void ButtonPrevCurrentStation2() { //переключение через кнопку prev
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prev();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void ButtonPrevCurrentStation9() { //переключение через кнопку prev
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        assertEquals(8, radio.getCurrentStation());
    }


    @Test
    public void setVolume0() { //установка громкости 0
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setVolumeMinus1() { //установка громкости 1
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }


    @Test
    public void setVolume1() { //установка громкости 1
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void setVolume99() { //установка громкости 99
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void setVolume100() { //установка громкости 99
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void setVolume101() { //установка громкости 99
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void reducingVolumeFrom0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.lessVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void reducingVolumeFrom1() { //установка громкости до минимума
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.lessVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void reducingVolumeFrom2() { //установка громкости до минимума
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.lessVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void reducingVolumeFrom99() { //уменьшение громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.lessVolume();
        assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void reducingVolumeFrom100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.lessVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

        @Test
    public void increaseVolumeFrom99() { //увеличение громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.moreVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeFrom100() { //увеличение грмкости при  max
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.moreVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void increaseVolumeFrom0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.moreVolume();
        assertEquals(1, radio.getCurrentVolume());
    }


}
