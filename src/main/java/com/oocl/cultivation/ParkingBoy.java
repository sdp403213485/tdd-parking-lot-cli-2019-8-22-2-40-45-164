package com.oocl.cultivation;

import java.util.ArrayList;

public class ParkingBoy {

	private ArrayList<ParkingLot> ParkingLotlist = new ArrayList<ParkingLot>();
//    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ArrayList<ParkingLot> ParkingLotlist) {
        this.ParkingLotlist = ParkingLotlist;
    }

    public ParkingTicket park(Car car) {
        // TODO: Please implement the method
    	int i =0;
    	
    	for ( i =0 ;i<ParkingLotlist.size();i++) {
        	if(this.ParkingLotlist.get(i).getAvailableParkingPosition() == 0) {
        		if (i+1<ParkingLotlist.size()) {
            		continue;	
        		}
        		this.lastErrorMessage = "The parking lot is full.";
            		return null;	

        	}else {
				break;
			}
    	}
        	
        	this.lastErrorMessage = null;
            return this.ParkingLotlist.get(i).parkCar(car);
    	
	

    	
    	
//  		int i =0;
//    	if(this.list.get(i).getAvailableParkingPosition() == 0) {
//    		if(i<list.size()) {
//    			
//
//    		}else {
//        		this.lastErrorMessage = "The parking lot is full.";
//        		return null;
//			}
//
//
//    	}
//    	this.lastErrorMessage = null;
//        return this.list.get(0).parkCar(car);
    	
    	
//    	
//    		int i =0;
//        	if(this.list.get(0).getAvailableParkingPosition() == 0) {
//        		if(this.list.get(1).getAvailableParkingPosition()==0) {
//            		this.lastErrorMessage = "The parking lot is full.";
//            		return null;	
//        		}
//        		this.lastErrorMessage = null;
//                return this.list.get(1).parkCar(car);
//
//        	}
//        	this.lastErrorMessage = null;
//            return this.list.get(0).parkCar(car);
    	

    }

    public Car fetch(ParkingTicket ticket) {
        // TODO: Please implement the method
    	if(ticket == null) {
    		this.lastErrorMessage = "Please provide your parking ticket.";
    		return null;
    	}
    	Car car = ParkingLotlist.get(1).getCarByTicket(ticket);
    	if(car == null) {
    		this.lastErrorMessage = "Unrecognized parking ticket.";
    		return null;
    	}
        return car;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
