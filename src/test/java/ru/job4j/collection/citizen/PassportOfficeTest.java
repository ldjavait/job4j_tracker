package ru.job4j.collection.citizen;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenNoAddTestMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen dup = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        boolean expected = office.add(dup);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
        assertThat(expected).isFalse();
    }
}