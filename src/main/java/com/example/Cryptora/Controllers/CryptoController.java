package com.example.Cryptora.Controllers;

import com.example.Cryptora.BussinesLayer.interfaces.CryptoService;
import com.example.Cryptora.Dtos.CryptoDto.CreateCryptoDto;
import com.example.Cryptora.Dtos.CryptoDto.UpdateCryptoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Crypto")
@RequiredArgsConstructor
public class CryptoController {
    private final CryptoService cryptoService;

    @PostMapping("/createCrypto")
    public ResponseEntity<Void> createCrypto(@RequestBody CreateCryptoDto createCryptoDto){
        cryptoService.createCrypto(createCryptoDto);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/updateCrypto")
    public ResponseEntity<Void> updateCrypto(@RequestBody UpdateCryptoDto updateCryptoDto){
        cryptoService.updateCrypto(updateCryptoDto);
        return ResponseEntity.ok().build();
    }



}
