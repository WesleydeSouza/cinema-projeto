package wesley.leonardo2.cinema.model;

import lombok.*;

    /**
     @author Wesley de Souza e Leonardo Santos
     @since 02/05/2020 00:50
     */
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    public class Cinema {

        @Getter @Setter
        private String filme;
        @Getter @Setter
        private String valorIngresso;
        @Getter @Setter
        private String horarioFilme;
        @Getter @Setter
        private String numeroPoltrona;
    }



