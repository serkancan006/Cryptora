package com.example.Cryptora.Controllers;

import com.example.Cryptora.BussinesLayer.interfaces.CryptoService;
import com.example.Cryptora.Dtos.CryptoDto.CreateCryptoDto;
import com.example.Cryptora.Dtos.CryptoDto.UpdateCryptoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Crypto")
@RequiredArgsConstructor
public class CryptoController {
    private final CryptoService cryptoService;

    @PostMapping("/createCrypto")
    public void createCrypto(@RequestBody CreateCryptoDto createCryptoDto){
        cryptoService.createCrypto(createCryptoDto);
    }

    @PutMapping("/updateCrypto")
    public void updateCrypto(@RequestBody UpdateCryptoDto updateCryptoDto){
        cryptoService.updateCrypto(updateCryptoDto);
    }



}
