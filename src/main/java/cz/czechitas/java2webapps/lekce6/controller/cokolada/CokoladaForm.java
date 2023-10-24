package cz.czechitas.java2webapps.lekce6.controller.cokolada;

import jakarta.validation.constraints.*;

public class CokoladaForm {

    @NotNull
    private Druh druh;
    @NotBlank
    private String jmeno;
    @Email
    private String email;
    @AssertTrue
    private boolean obchodniPodminky;

    public Druh getDruh() {
        return druh;
    }

    public void setDruh(Druh druh) {
        this.druh = druh;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isObchodniPodminky() {
        return obchodniPodminky;
    }

    public void setObchodniPodminky(boolean obchodniPodminky) {
        this.obchodniPodminky = obchodniPodminky;
    }
}
