package guru.springframework.sfgpetclinic.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
public class Owner extends Person {

    private Set<Pet> pets;
}
