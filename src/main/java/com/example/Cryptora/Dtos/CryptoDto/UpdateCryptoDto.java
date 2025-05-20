package com.example.Cryptora.Dtos.CryptoDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCryptoDto {
    private Long id;
    private String symbol;
    private String name;
}
