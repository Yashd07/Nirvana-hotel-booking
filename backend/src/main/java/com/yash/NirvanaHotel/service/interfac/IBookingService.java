package com.yash.NirvanaHotel.service.interfac;

import com.yash.NirvanaHotel.dto.Response;
import com.yash.NirvanaHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
