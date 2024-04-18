package br.com.ero.service_booking_system.services.client;

import br.com.ero.service_booking_system.dto.AdDTO;
import br.com.ero.service_booking_system.dto.ReservationDTO;
import br.com.ero.service_booking_system.entities.Ad;
import br.com.ero.service_booking_system.entities.Reservation;
import br.com.ero.service_booking_system.entities.User;
import br.com.ero.service_booking_system.enums.ReservationStatus;
import br.com.ero.service_booking_system.enums.ReviewStatus;
import br.com.ero.service_booking_system.repositories.AdRepository;
import br.com.ero.service_booking_system.repositories.ReservationRepository;
import br.com.ero.service_booking_system.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private AdRepository adRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    public List<AdDTO> getAllAds(){
        return adRepository.findAll().stream().map(Ad::getAdDto).collect(Collectors.toList());
    }

    public List<AdDTO> searchAdByName(String name){
        return adRepository.findAllByServiceNameContaining(name).stream().map(Ad::getAdDto).collect(Collectors.toList());
    }

    public boolean bookService(ReservationDTO reservationDTO){
        Optional<Ad> optionalAd = adRepository.findById(reservationDTO.getAdId());
        Optional<User> optionalUser = userRepository.findById(reservationDTO.getUserId());

        if (optionalAd.isPresent() && optionalUser.isPresent()){
            Reservation reservation = new Reservation();

            reservation.setBookDate(reservationDTO.getBookDate());
            reservation.setReservationStatus(ReservationStatus.PENDING);
            reservation.setUser(optionalUser.get());

            reservation.setAd(optionalAd.get());
            reservation.setCompany(optionalAd.get().getUser());
            reservation.setReviewStatus(ReviewStatus.FALSE);

            reservationRepository.save(reservation);
            return true;
        }

        return false;
    }
}
