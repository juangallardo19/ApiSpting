package com.example.vehicleapi.exception;

public class VehicleNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 8745632198745632198L;

    public VehicleNotFoundException(String message) {
        super(message);
    }

    public VehicleNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public VehicleNotFoundException(Throwable cause) {
        super(cause);
    }
}
