package br.com.ero.service_booking_system.dto;

import br.com.ero.service_booking_system.enums.ReservationStatus;
import br.com.ero.service_booking_system.enums.ReviewStatus;
import lombok.Data;

import java.util.Date;

@Data
public class ReservationDTO {

    private Long id;
    private Date bookDate;
    private String serviceName;
    private ReservationStatus reservationStatus;
    private ReviewStatus reviewStatus;

    private Long userId;
    private String userName;
    private Long companyId;
    private Long adId;
}
