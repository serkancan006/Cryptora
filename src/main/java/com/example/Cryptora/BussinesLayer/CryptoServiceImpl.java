package com.example.Cryptora.BussinesLayer;

import com.example.Cryptora.BussinesLayer.interfaces.CryptoService;
import com.example.Cryptora.DataAccessLayer.Repositories.CryptoRepo;
import com.example.Cryptora.Dtos.CryptoDto.CreateCryptoDto;
import com.example.Cryptora.Dtos.CryptoDto.UpdateCryptoDto;
import com.example.Cryptora.EntityLayer.Entities.Crypto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CryptoServiceImpl implements CryptoService {
    private final CryptoRepo cryptoRepo;

    @Override
    public void createCrypto(CreateCryptoDto createCryptoDto){
        Crypto crypto = Crypto.builder().name(createCryptoDto.getName()).symbol(createCryptoDto.getSymbol()).build();
        cryptoRepo.save(crypto);
    }

    @Override
    public void updateCrypto(UpdateCryptoDto updateCryptoDto){
        Crypto crypto = Crypto.builder().id(updateCryptoDto.getId()).name(updateCryptoDto.getName()).symbol(updateCryptoDto.getSymbol()).build();
        cryptoRepo.save(crypto);
    }

    @Override
    public void deleteCrypto(Long id){
        cryptoRepo.deleteById(id);
    }

    @Override
    public List<Crypto> getCryptos(){
        return cryptoRepo.findAll();
    }



}
