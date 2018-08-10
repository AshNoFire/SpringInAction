package soundsystem.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({CDPlayerConfig.class, CDConfig.class})
@ImportResource("classpath:soundsystem/cd-config.xml")
public class SoundSystemConfig {
}
