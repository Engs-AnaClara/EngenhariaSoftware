package util;

import java.util.regex.Pattern;

public class ValidadorEmail {
    private static final Pattern PADRAO = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    public static boolean isValido(String email) {
        return email != null && PADRAO.matcher(email).matches();
    }
}
