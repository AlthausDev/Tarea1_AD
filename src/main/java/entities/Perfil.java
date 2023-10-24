package entities;

/**
 * Enumeración que representa los diferentes perfiles de usuarios en la aplicación.
 *
 * @author S.Althaus
 */
public enum Perfil {
    /**
     * El perfil de un peregrino.
     */
    PEREGRINO,

    /**
     * El perfil de un administrador de parada.
     */
    ADMIN_PARADA,

    /**
     * El perfil de un administrador general.
     */
    ADMIN_GENERAL,

    /**
     * El perfil de un invitado, esto es, alguien no logeado.
     */
    INVITADO
}
