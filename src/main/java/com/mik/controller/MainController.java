package com.mik.controller;

import com.mik.model.*;
import com.mik.service.AddressComplexService;
import com.mik.service.AddressService;
import com.mik.service.CountryService;
import com.mik.service.PhoneService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by mikitjuk on 02.10.15.
 */
@Controller
public class MainController {

    protected static Logger logger = Logger.getLogger("controller");

    @Autowired
    private AddressService addressService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private AddressComplexService addressComplexService;
    @Autowired
    private PhoneService phoneService;

    // Retrieve all address
    @RequestMapping(value ="/index")
    public String mainForm(Model model){

        // get all address by delegating the call to AddressService
        model.addAttribute("addressAll", addressService.getListAll());
      //  model.addAttribute("countryList", countryService.getList());
        return "address";
    }

    //Create new address
    @RequestMapping(value = "/address/create", method = RequestMethod.GET)
    public String getAdd(Model model) {
        logger.debug("Request to show create page");

        model.addAttribute("addressAttribute", new AddressForm());

        // This will resolve to /WEB-INF/jsp/addpage.jsp
        return "createpage";
    }

    @RequestMapping(value = "/address/create", method = RequestMethod.POST)
    public String create(@ModelAttribute("addressAttribute") AddressForm addressForm, Model model) {
        logger.debug("Request to create new address");


        //!!! necessary to check the existence of records in directories
        Address address = new Address();

        AddressComplex addressComplex = new AddressComplex(addressForm.getCountry(),
                addressForm.getCity(), addressForm.getStreet(), addressForm.getBuild());
        addressComplexService.create(addressComplex);
        address.setAddressComplex(addressComplex);

        Phone phone = new Phone(addressForm.getPhone());
        phoneService.create(phone);
        address.setPhoneByIdPhone(phone);

        addressService.create(address);

        model.addAttribute("addressAll", addressService.getListAll());
        //model.addAttribute("countryList", countryService.getList());
        return "address";
        //return "addedpage";
    }



}
