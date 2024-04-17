package br.com.ero.service_booking_system.services.company;

import br.com.ero.service_booking_system.dto.AdDTO;

import java.io.IOException;
import java.util.List;

public interface CompanyService {

    boolean postAd(Long userId, AdDTO adDTO) throws IOException;

    List<AdDTO> getAllAds(Long userId);

    AdDTO getAdById(Long adId);
}
