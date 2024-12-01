package programmer.zaman.now.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Target menentukan di mana annotation bisa digunakan
// Dalam hal ini, bisa digunakan di TYPE (kelas/interface) dan METHOD
@Target({ElementType.TYPE, ElementType.METHOD})

// @Retention menentukan kapan annotation tersedia
// RUNTIME berarti annotation bisa dibaca saat program berjalan
@Retention(RetentionPolicy.RUNTIME)

// Deklarasi custom annotation
public @interface Fancy {
    // Metode name() wajib diisi saat menggunakan annotation
    String name();

    // tags() adalah opsional, defaultnya array kosong
    String[] tags() default {};
}