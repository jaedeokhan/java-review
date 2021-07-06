package coding._14_Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 정의
@Retention(RetentionPolicy.RUNTIME) // JVM이 실행시 감지할 수 있게
public @interface Count100 {

}
