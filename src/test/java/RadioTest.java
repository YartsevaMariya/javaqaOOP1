import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;

public class RadioTest {
    @Test
    public void testRadioIfStationIsInLimits() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioIfStationIsBelowLimits() {
        Radio radio = new Radio();

        radio.setCurrentStation(-3);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioIfStationIsAboveLimits() {
        Radio radio = new Radio();

        radio.setCurrentStation(15);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioIfStationIsBelowLimitsAtTheBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioIfStationIsOnTheLowerBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioIfStationIsInLimitsAtTheBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioIfStationIsInLimitsOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioIfStationIsOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRadioIfStationIsAboveLimitsOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(6);
        radio.next();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextRadioStationOnTheLowerBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextRadioStationInLimitsOnTheLowerBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextRadioStationOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextRadioStationOnTheUpperBorderCycle() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        radio.prev();
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevRadioStationOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevRadioStationInLimitsOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevRadioStationOnTheLowerBorder() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevRadioStationOnTheLowerBorderCycle() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(3);
        radio.increaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolumeOnTheLowerBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolumeInLimitsOnTheLowerBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolumeInLimitsOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseVolumeOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolumeOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolumeInLimitsOnTheUpperBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);
        radio.decreaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolumeInLimitsOnTheLowerBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDecreaseVolumeOnTheLowerBorder() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}