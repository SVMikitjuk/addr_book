package com.mik.controller;

import com.mik.model.Address;
import com.mik.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by mikitjuk on 02.10.15.
 */
@Controller
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping("/index")
    public String mainForm(Map<String, Object> map){
        Address address= new Address() ;
        map.put("address", address);
        map.put("addressAll", addressService.getListAll());
        return "address";
    }

    @RequestMapping(value = "/address.do", method = RequestMethod.POST)
    public String doActions(@ModelAttribute Address address, BindingResult result, @RequestParam String action, Map<String, Object> map){
        Address addressRes = new Address() ;
        String s = action.toLowerCase();
        if (s.equals("create")) {
            addressService.create(address);
            addressRes = address;
        } else if (s.equals("read")) {
            Address addressRead = addressService.read(address.getId());
            addressRes = addressRead != null ? addressRead : new Address();
        } else if (s.equals("update")) {
            addressService.update(address);
            addressRes = address;
        } else if (s.equals("delete")) {
            addressService.delete(address);
            addressRes = new Address();
        }
        map.put("address", addressRes);
        map.put("addressAll", addressService.getListAll());
        return "address";
    }

}
