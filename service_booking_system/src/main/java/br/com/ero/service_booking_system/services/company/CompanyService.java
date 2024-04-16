package br.com.ero.service_booking_system.services.company;

import br.com.ero.service_booking_system.dto.AdDTO;

import java.io.IOException;

public interface CompanyService {

    boolean postAd(Long userId, AdDTO adDTO) throws IOException;
}
