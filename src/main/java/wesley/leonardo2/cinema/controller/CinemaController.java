package wesley.leonardo2.cinema.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wesley.leonardo2.cinema.model.Cinema;

import java.util.ArrayList;
@RestController
public class CinemaController {
    @GetMapping("/cinema")
    public Cinema getCinema() {

        Cinema cinema = new Cinema();

        cinema.setFilme("Malevola 2");
        cinema.setValorIngresso("R$20.00");
        cinema.setHorarioFilme("18:00h");
        cinema.setNumeroPoltrona("7A");

        return cinema;
    }
    @GetMapping("/cadastros")
    public ArrayList<Cinema> getCadastros(){

        Cinema cinema1 = new Cinema();

        cinema1.setFilme("Vingadores Ultimato");
        cinema1.setValorIngresso("R$20.00");
        cinema1.setHorarioFilme("14:00h");
        cinema1.setNumeroPoltrona("5B");

        Cinema cinema2 = new Cinema();

        cinema2.setFilme("Frozen");
        cinema1.setValorIngresso("R$25.00");
        cinema1.setHorarioFilme("17:30h");
        cinema1.setNumeroPoltrona("6H");

        Cinema cinema3 = new Cinema();

        cinema3.setFilme("Blade");
        cinema3.setValorIngresso("R$21.00");
        cinema3.setHorarioFilme("19:00h");
        cinema3.setNumeroPoltrona("7C");


        ArrayList<Cinema> cadastro = new ArrayList<>();

        cadastro.add(cinema1);
        cadastro.add(cinema2);
        cadastro.add(cinema3);
        return cadastro;
    }




}
