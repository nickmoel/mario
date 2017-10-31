import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;


public class StationTest {

    //Station List
//0 5TH & MISSOURI METROLINK STATION
//1 8TH AND PINE METROLINK STATION  2 BELLEVILLE METROLINK STATION  3 BRENTWOOD METROLINK STATION
//4 CENTRAL WEST END METROLINK STATION  5 CIVIC CENTER METROLINK STATION  6 CLAYTON METROLINK STATION
//7 COLLEGE METROLINK STATION  8 CONVENTION CENTER METROLINK STATION  9 DELMAR METROLINK STATION
//10 EAST RIVERFRONT METROLINK STATION  11 EMERSON PARK METROLINK STATION  12 FAIRVIEW HEIGHTS METROLINK STATION
//13 FOREST PARK METROLINK STATION  14 FORSYTH METROLINK STATION  15 GRAND METROLINK STATION
//16 JJK CENTER METROLINK STATION  17 LACLEDES LANDING METROLINK STATION  18 LAMBERT EAST TRML METROLINK STATION
//19 LAMBERT MAIN TRML METROLINK STATION  20 MAPLEWOOD METROLINK STATION  21 MEMORIAL HOSPITAL METROLINK STATION
//22 NORTH HANLEY METROLINK STATION  23 RICHMOND HEIGHTS METROLINK STATION  24 ROCK ROAD METROLINK STATION
//25 SHILOH-SCOTT METROLINK STATION  26 SHREWSBURY METROLINK STATION  27 SKINKER METROLINK STATION
//28 STADIUM METROLINK STATION  29 SUNNEN METROLINK STATION  30 SWANSEA METROLINK STATION
//31 UMSL NORTH METROLINK STATION  32 UMSL SOUTH METROLINK STATION  33 UNION STA METROLINK STATION
//34 WASHINGTON PARK METROLINK STATION  35 WELLSTON METROLINK STATION

    //Stops metroStops;

   @Test
    public void stationZero5thAndMissouri() {
        assertThat(Validation.validate(0), is(0));


    }

    @Test
    public void stationThirtyFiveWellston() {
        assertThat(Validation.validate(35), is(35));


    }
}
