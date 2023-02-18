package com.jdojo.annotation.deprecated;

public class BoxTest {

    /**
     * API: not deprecated
     * Use-site: not deprecated
     * Deprecation warning: no warning
     */
    public static void m11() {
        Box.notDeprecated();
    }

    /**
     * API: ordinarily deprecated
     * Use-site: not deprecated
     * Deprecation warning: no warning
     */
    public static void m12() {
        Box.deprecatedOrdinarily();
    }

    /**
     * API: terminally deprecated
     * Use-site: not deprecated
     * Deprecation warning: removal warning
     */
    public static void m13() {
        Box.deprecatedTerminally();
    }

    /**
     * API: not deprecated
     * Use-site: ordinarily deprecated
     * Deprecation warning: no warning
     *
     * @deprecated Dangerous to use
     */
    @Deprecated(since = "1.1")
    public static void m21() {
        Box.notDeprecated();
    }

    /**
     * API: ordinarily deprecated
     * Use-site: ordinarily deprecated
     * Deprecation warning: no warning
     *
     * @deprecated Dangerous to use
     */
    @Deprecated(since = "1.1")
    public static void m22() {
        Box.deprecatedOrdinarily();
    }

    /**
     * API: terminally deprecated
     * Use-site: ordinarily deprecated
     * Deprecation warning: removal warning
     *
     * @deprecated Dangerous to use
     */
    @Deprecated(since = "1.1")
    public static void m23() {
        Box.deprecatedTerminally();
    }

    /**
     * API: not deprecated
     * Use-site: terminally deprecated
     * Deprecation warning: no warning
     *
     * @deprecated Going away
     */
    @Deprecated(since = "1.1", forRemoval = true)
    public static void m31() {
        Box.notDeprecated();
    }

    /**
     * API: ordinarily deprecated
     * Use-site: terminally deprecated
     * Deprecation warning: no warning
     *
     * @deprecated Going away
     */
    @Deprecated(since = "1.1", forRemoval = true)
    public static void m32() {
        Box.deprecatedOrdinarily();
    }

    /**
     * API: terminally deprecated
     * Use-site: terminally deprecated
     * Deprecation warning: removal warning
     *
     * @deprecated Going away
     */
    @Deprecated(since = "1.1", forRemoval = true)
    public static void m33() {
        Box.deprecatedTerminally();
    }

    /**
     * API: ordinarily and terminally deprecated
     * Use-site: not deprecated
     * Deprecation warning: ordinary and removal warnings
     */
    public static void m41() {
        Box.deprecatedOrdinarily();
        Box.deprecatedTerminally();
    }

    /**
     * API: ordinarily and terminally deprecated
     * Use-site: not deprecated
     * Deprecation warning: ordinary warning
     */
    @SuppressWarnings("deprecation")
    public static void m42() {
        Box.deprecatedOrdinarily();
        Box.deprecatedTerminally();
    }

    /**
     * API: ordinarily and terminally deprecated
     * Use-site: not deprecated
     * Deprecation warning: removal warning
     */
    @SuppressWarnings("removal")
    public static void m43() {
        Box.deprecatedOrdinarily();
        Box.deprecatedTerminally();
    }

    /**
     * API: ordinarily and terminally deprecated
     * Use-site: not deprecated
     * Deprecation warning: removal warning
     */
    @SuppressWarnings({"deprecation", "removal"})
    public static void m44() {
        Box.deprecatedOrdinarily();
        Box.deprecatedTerminally();
    }
}
