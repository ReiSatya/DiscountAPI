package com.dev.APIDiscount.controller;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dev.APIDiscount.dto.DiscountDTO;
import com.dev.APIDiscount.exception.OutletNotFoundException;
import com.dev.APIDiscount.model.Discount;
import com.dev.APIDiscount.model.Outlet;
import com.dev.APIDiscount.repository.DiscountRepository;
import com.dev.APIDiscount.repository.OutletRepository;
import com.dev.APIDiscount.service.DiscountService;

@RestController
public class DiscountController {
	@Autowired
    private DiscountService discountService;
	
	@GetMapping("/discount/{outletId}")
    public ResponseEntity<List<DiscountDTO>> getDiscounts(@PathVariable String outletId) {
        List<DiscountDTO> discounts = discountService.getValidDiscounts(outletId);
        return new ResponseEntity<>(discounts, HttpStatus.OK);
    }
	
//	@GetMapping("/discount/{outletId}")
//    public ResponseEntity<List<Discount>> getDiscounts(@PathVariable String outletId) {
//        List<Discount> discounts = discountService.getValidDiscounts(outletId);
//        return new ResponseEntity<>(discounts, HttpStatus.OK);
//    }

//    @GetMapping("/discount")
//    public ResponseEntity<Outlet> getValidDiscounts(@RequestParam String outletid) {
//        Outlet outlet = discountService.getOutletById(outletid);
//        List<Discount> validDiscounts = discountService.getValidDiscounts(outletid);
//
//        OutletDTO outletDTO = new OutletDTO(outlet.getId());
//
//        return ResponseEntity.ok(outlet);
//    }
	
	//  /discount?outletid=BDG000024
    
//    @GetMapping("/discount")
//    public ResponseEntity<OutletDTO> getValidDiscounts(@RequestParam String outletid) {
//        Outlet outlet = discountService.getOutletById(outletid);
//
//        OutletDTO outletIdDTO = new OutletDTO(outlet.getId());
//
//        return ResponseEntity.ok(outletIdDTO);
//    }

    @ExceptionHandler(OutletNotFoundException.class)
    public ResponseEntity<String> handleOutletNotFoundException(OutletNotFoundException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}