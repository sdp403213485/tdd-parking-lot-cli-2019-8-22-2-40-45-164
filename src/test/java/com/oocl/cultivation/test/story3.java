package com.oocl.cultivation.test;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ParkingLot;
import com.oocl.cultivation.ParkingTicket;

class ParkingBoyFacts {
    }

@Test
	void should_parked_the_car_in_second_parkinglot_when_boy_park_car_given_parkinglot_car(){
	ParkingLot[] parkingLosts=new ParkingLot[2];
	ParkingLots[0]=new ParkingLot(0);
	ParkingLots[1]=new ParkingLot(2);
	Car car = new Car();
	ParkingBoy parkingBoy = new ParkingBoy(ParingLots);
	
	ParkingTicket ticket = parkingBoy.park(car);
	
	assertEquals(car,parkingLots[1].fetch(ticket));	
}