package kz.bitlab.first.demo.models;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Magazine {
    private Long id;
    private String name;
    private String description;
}
