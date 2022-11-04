package kz.bitlab.first.demo.models;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@Component
public class Magazine {
    private Long id;
    private String name;
    private String description;

    public Magazine() {
        System.out.println("Magazine was created");
    }
}
