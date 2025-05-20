package com.example.Cryptora.Dtos.CryptoDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCryptoDto {
    private String symbol;
    private String name;
}
