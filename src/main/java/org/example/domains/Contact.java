package org.example.domains;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@RequiredArgsConstructor
public class Contact implements Serializable {
    private Long id;
    private String name;
    private ContactType type;
    private String value;
}
