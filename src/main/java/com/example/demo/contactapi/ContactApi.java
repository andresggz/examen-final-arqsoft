package com.example.demo.contactapi;

import com.example.demo.ContactDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ContactApi {

    @GetMapping(path = "/contact")
    public ResponseEntity<ContactDto> getContacto(){
      return ResponseEntity.ok(new ContactDto(1L, "Andres ", "Grisales", "5682532",
                "andres.grisalesg@udea.edu.co"));
    }
}
