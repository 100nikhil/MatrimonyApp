package com.matrimony.controllers;


import com.matrimony.models.UserDetails;
import com.matrimony.services.UserService;
import com.matrimony.util.StringToDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchingController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home(){
        return "searchPage";
    }

    @GetMapping("/byId")
    public String searchByName(){
        //code
        return "idSearchPage";
    }

    @GetMapping("/advance")
    public String searchAdvance(){
        //code
        return "advanceSearchPage";
    }

    @PostMapping(value="/byId")
    public String searchResults(@ModelAttribute("id") long id, Model model){
        UserDetails userDetails = userService.getById(id);
        model.addAttribute("userDetails",userDetails);
        return "idSearchResult";
    }

    @PostMapping(value="/advance")
    public String searchResults1(@RequestParam("age") long age,
                                 @RequestParam("occupation") String occupation,
                                 @RequestParam("annual_income") double annual_income,
                                 @RequestParam("qualification") String qualification,
                                 @RequestParam("cast_preference") String cast_preference,
                                 @RequestParam("languages") String languages,
                                 @RequestParam("weight") int weight,
                                 @RequestParam("height") int height,
                                 @RequestParam("habits") String habits,
                                 @RequestParam("complexion") String complexion,
                                 @RequestParam("religion") String religion,
                                 @RequestParam("marital_status") String marital_status,
                                 @RequestParam("gender") String gender,
                                 Model model) throws ParseException {
        //code
        String s = String.valueOf(2021-age)+"/01/01";
        Date dob = StringToDate.convert(s);

        List<Long> list = userService.findByMultipleFields(dob,occupation,annual_income,qualification,cast_preference,
                languages,weight,height,habits,complexion,religion,marital_status,gender);

        List<UserDetails> userDetails = new ArrayList<>();

        for(Long item: list){
            userDetails.add(userService.getById(item));
        }

        /*
        model.addAttribute("age", age);
        model.addAttribute("occupation", occupation);
        model.addAttribute("annual_income", annual_income);
        model.addAttribute("qualification", qualification);
        model.addAttribute("cast_preference", cast_preference);
        model.addAttribute("languages", languages);
        model.addAttribute("weight", weight);
        model.addAttribute("height", height);
        model.addAttribute("habits", habits);
        model.addAttribute("complexion", complexion);
        model.addAttribute("religion", religion);
        model.addAttribute("marital_status", marital_status);

         */


        model.addAttribute("list",userDetails);
        return "advanceSearchResult";
    }


}
