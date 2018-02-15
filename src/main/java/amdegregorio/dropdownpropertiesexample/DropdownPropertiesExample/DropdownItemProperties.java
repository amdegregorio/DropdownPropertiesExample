package amdegregorio.dropdownpropertiesexample.DropdownPropertiesExample;

import java.util.SortedMap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:dropdownValues.properties")
@ConfigurationProperties(prefix = "dropdownValue")
public class DropdownItemProperties {
   private SortedMap<String, String> userRoleOptions;

   public SortedMap<String, String> getUserRoleOptions() {
      return userRoleOptions;
   }

   public void setUserRoleOptions(SortedMap<String, String> userRoleOptions) {
      this.userRoleOptions = userRoleOptions;
   }

}
