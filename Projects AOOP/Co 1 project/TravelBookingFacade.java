public class TravelBookingFacade {
    private FlightBooking flightBooking;
    private HotelBooking hotelBooking;
    private CarRental carRental;

    public TravelBookingFacade() {
        this.flightBooking = new FlightBooking();
        this.hotelBooking = new HotelBooking();
        this.carRental = new CarRental();
    }

    public String bookTrip(String flightDetails, String hotelDetails, String carDetails) {
        String flightConfirmation = flightBooking.bookFlight(flightDetails);
        String hotelConfirmation = hotelBooking.bookHotel(hotelDetails);
        String carConfirmation = carRental.rentCar(carDetails);

        return flightConfirmation + "\n" + hotelConfirmation + "\n" + carConfirmation;
    }

}
