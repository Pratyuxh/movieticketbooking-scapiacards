package com.example.movieticketbooking.service.impl;


import com.example.movieticketbooking.model.Booking;
import com.example.movieticketbooking.repository.BookingRepository;
import com.example.movieticketbooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class BookingServiceImpl implements BookingService {
    private BookingRepository bookingRepository;

    @Autowired
    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(Long booking_id) {
        return null;
    }

    @Override
    public Booking pushBooking(Booking newBooking) {
        return null;
    }

    @Override
    public Booking updateBooking(Booking updatedBooking, Long booking_id) {
        return null;
    }

    @Override
    public void deleteBookingById(Long booking_id) {

    }
}

