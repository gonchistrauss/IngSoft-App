
package utils;

import java.util.Locale;

public class Tipos {
    
    public enum Estado{      
    PENDIENTE, COMPLETADO, EN_PROCESO
    }

    public enum Categoria {
        DIRECTA, PLAN_ALIMENTICIO
    }
    
    public static String[] obtenerpaises() {
    String[] countries = new String[Locale.getISOCountries().length];
    String[] countryCodes = Locale.getISOCountries();
    for (int i = 0; i < countryCodes.length; i++) {
        Locale obj = new Locale("", countryCodes[i]);
        countries[i] = obj.getDisplayCountry();
    }
    return countries;
 
    }
}
