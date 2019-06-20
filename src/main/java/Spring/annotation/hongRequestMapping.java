package Spring.annotation;
import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface hongRequestMapping {
    public String value() default "";
    public String key() default "";
}
