package com.wrz.controller;

import com.wrz.entity.house;
import com.wrz.service.iHouseService;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HouseController {
    Logger logger =Logger.getLogger(HouseController.class);
    @Autowired
    private iHouseService houseService;
    @RequestMapping("page")
    public String page(String page){
        return page;
    }
    @RequestMapping("queryAll")
    public String getHouse(Model model){
        try {
            logger.debug("house query doing....");
            List<house> houses = houseService.queryAll();
            model.addAttribute("house",houses);
            logger.debug("house query done....");
        }catch (Exception e){
            e.printStackTrace();
            logger.error("query house Exception",e);
        }
        return "forward:page?page=index";
    }
}
