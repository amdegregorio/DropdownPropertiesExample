package amdegregorio.dropdownpropertiesexample.DropdownPropertiesExample;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
   @Autowired
   private DropdownItemProperties dropdownItemProperties;
   
   @Autowired
   private RadioButtonProperties radioButtonItemProperties;
   
   @RequestMapping("/")
   public String displayExample(User user, Model model) { 
      
      return "example";
   }
   
   @RequestMapping(value="/save", params={"save"}, method=RequestMethod.POST)
   public String saveUser(@Valid User user, BindingResult bindingResult,
            Model model) {
      System.out.println(user.toString());
      return "redirect:/";
   }

   @ModelAttribute("userRoleOptions")
   public Map<String, String> getUserRoleOptions() {
      return dropdownItemProperties.getUserRoleOptions();
   }
   
   @ModelAttribute("statusOptions")
   public Map<String, String> getStatusOptions() {
      return radioButtonItemProperties.getStatusOptions();
   }
}
