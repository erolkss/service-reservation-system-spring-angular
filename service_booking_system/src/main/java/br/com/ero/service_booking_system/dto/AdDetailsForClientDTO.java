package br.com.ero.service_booking_system.dto;

import lombok.Data;

import java.util.List;

@Data
public class AdDetailsForClientDTO {

    private AdDTO adDTO;
    private List<ReviewDTO> reviewDTOList;
}
