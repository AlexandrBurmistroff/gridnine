package com.gridnine.testing;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();

        FlightFilter departureBeforeNowFilter = new DepartureBeforeNowFilter();
        List<Flight> filteredFlights1 = departureBeforeNowFilter.filterFlights(flights);
        System.out.println("Включен фильтр по вылету до текущего момента времени: " + filteredFlights1);

        FlightFilter arrivalBeforeDepartureFilter = new ArrivalBeforeDepartureFilter();
        List<Flight> filteredFlights2 = arrivalBeforeDepartureFilter.filterFlights(flights);
        System.out.println("Включен фильтр по дате прилета раньше даты вылета: " + filteredFlights2);

        FlightFilter groundTimeMoreThanTwoHoursFilter = new GroundTimeMoreThanTwoHoursFilter();
        List<Flight> filteredFlights3 = groundTimeMoreThanTwoHoursFilter.filterFlights(flights);
        System.out.println("Включен фильтр по общему времени на земле более двух часов: " + filteredFlights3);

        System.out.println("Исходные тестовые данные без фильтров:" + flights);
    }
}