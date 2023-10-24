package cz.czechitas.java2webapps.lekce6.controller.rocniObdobi;

import java.util.EnumSet;

/**
 * EnumSet je množina prvků, nemůžou se opakovat, pořadí je náhodný
 */
public class RocniObdobiForm {
  private EnumSet<RocniObdobiEnum> oblibene = EnumSet.noneOf(RocniObdobiEnum.class);

  public EnumSet<RocniObdobiEnum> getOblibene() {
    return oblibene;
  }

  public void setOblibene(EnumSet<RocniObdobiEnum> oblibene) {
    this.oblibene = oblibene;
  }
}
