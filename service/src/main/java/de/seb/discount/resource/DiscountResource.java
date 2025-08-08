package de.seb.discount.resource;

import de.seb.api.HelloApi;
import de.seb.api.HelloResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscountResource implements HelloApi {

    @Override
    public ResponseEntity<HelloResponse> getHelloMessage() {
        return ResponseEntity.ok(new HelloResponse().message("Hello World"));
    }

}
