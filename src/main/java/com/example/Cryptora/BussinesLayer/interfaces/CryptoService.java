package com.example.Cryptora.BussinesLayer.interfaces;

import com.example.Cryptora.Dtos.CryptoDto.CreateCryptoDto;
import com.example.Cryptora.Dtos.CryptoDto.UpdateCryptoDto;
import com.example.Cryptora.EntityLayer.Entities.Crypto;

import java.util.List;

public interface CryptoService {
    void createCrypto(CreateCryptoDto createCryptoDto);

    void updateCrypto(UpdateCryptoDto updateCryptoDto);

    void deleteCrypto(Long id);

    List<Crypto> getCryptos();
}
