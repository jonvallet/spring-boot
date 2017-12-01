package com.jonvallet.restdemo.location;

import com.jonvallet.restdemo.model.Location;
import org.junit.Test;
import org.springframework.data.util.Pair;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class TestSortByLocationDistance {

    private static final double DELTA = 1e-15;

    @Test
    public void testDistance() {
        int expectedValue = 782;
        double actualValue = new Location(10, 10).distance(new Location(5, 5));

        assertEquals(expectedValue, (int)actualValue);
    }

    @Test
    public void testSortByGivenDistanceLocation () {

        List<Location> locations = new ArrayList<>();

        Location l1 = new Location(40, 20);
        Location l2 = new Location(30, 20);
        Location l3 = new Location(20, 20);

        locations.add(l1);
        locations.add(l2);
        locations.add(l3);

        Location compare = new Location(10, 10);

        List<Location> sortedList = locations.stream().map(l -> Pair.of(compare.distance(l), l))
                .sorted(Comparator.comparingDouble(Pair::getFirst))
                .map(Pair::getSecond).collect(Collectors.toList());

        assertEquals(sortedList.get(0), l3);
        assertEquals(sortedList.get(1), l2);
        assertEquals(sortedList.get(2), l1);

    }

}
