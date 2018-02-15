package amdegregorio.dropdownpropertiesexample.DropdownPropertiesExample;

import java.util.SortedMap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:dropdownValues.properties")
@ConfigurationProperties(prefix = "radioValue")
public class RadioButtonProperties {
   private SortedMap<String, String> statusOptions;

   public SortedMap<String, String> getStatusOptions() {
      return statusOptions;
   }

   public void setStatusOptions(SortedMap<String, String> statusOptions) {
      this.statusOptions = statusOptions;
   }

   

}
