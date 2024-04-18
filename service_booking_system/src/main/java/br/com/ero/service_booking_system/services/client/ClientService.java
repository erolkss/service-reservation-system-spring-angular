package br.com.ero.service_booking_system.services.client;

import br.com.ero.service_booking_system.dto.AdDTO;
import br.com.ero.service_booking_system.dto.ReservationDTO;

import java.util.List;

public interface ClientService {

    List<AdDTO> getAllAds();

    List<AdDTO> searchAdByName(String name);

    boolean bookService(ReservationDTO reservationDTO);
}
