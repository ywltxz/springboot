package com.demoproperty.demoproperty.Controller;

import cn.hutool.core.lang.Dict;
import com.demoproperty.demoproperty.property.ApplicationProperty;
import com.demoproperty.demoproperty.property.DeveloperProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {
    private ApplicationProperty applicationProperty;
    private DeveloperProperty developerProperty;

    @Autowired
    public PropertyController(ApplicationProperty applicationProperty,DeveloperProperty developerProperty){
        this.applicationProperty=applicationProperty;
        this.developerProperty=developerProperty;
    }

    @RequestMapping("/property")
    public Dict index() {
        return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developerProperty);
    }
}
