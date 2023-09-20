package com.dev.APIDiscount.service;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.APIDiscount.dto.DiscountDTO;
import com.dev.APIDiscount.exception.OutletNotFoundException;
import com.dev.APIDiscount.model.Discount;
import com.dev.APIDiscount.model.Outlet;
import com.dev.APIDiscount.repository.DiscountRepository;
import com.dev.APIDiscount.repository.OutletRepository;

@Service
public class DiscountService {
    @Autowired
    private DiscountRepository discountRepository;

    @Autowired
    private OutletRepository outletRepository;
    
    
    public List<DiscountDTO> getValidDiscounts(String outletId) {
        
        List<Discount> allDiscounts = discountRepository.findAll();

        
        List<DiscountDTO> validDiscounts = new ArrayList<>();

  
        Date currentDate = new Date(0);
        Time currentTime = new Time(currentDate.getTime());

        for (Discount discount : allDiscounts) {
  
            if (isValidDate(discount, currentDate) && isValidTime(discount, currentTime)) {
 
                if (isValidDiscountType(discount, outletId)) {
                	DiscountDTO discountDTO = new DiscountDTO(discount);
                	
                	if ("outlet".equalsIgnoreCase(discount.getType())) {
                        Outlet outlet = outletRepository.findById(outletId).orElse(null);
                        if (outlet != null) {
                            discountDTO.setOutletId(outlet.getId());
                            discountDTO.setOutletName(outlet.getName());
                        }
                    }
                	
                	validDiscounts.add(discountDTO);
                }
            }
        }

        return validDiscounts;
    }

    private boolean isValidDate(Discount discount, Date currentDate) {
        return !currentDate.before(discount.getStartDate()) && !currentDate.after(discount.getEndDate());
    }

    private boolean isValidTime(Discount discount, Time currentTime) {
        return !currentTime.before(discount.getStartTime()) && !currentTime.after(discount.getEndTime());
    }

    private boolean isValidDiscountType(Discount discount, String outletId) {
        if ("outlet".equalsIgnoreCase(discount.getType())) {
            Outlet outlet = outletRepository.findById(outletId).orElse(null);
            if (outlet != null) {
            	return true;
            }
        } else {

        }

        return false;
    }
    
    public Outlet getOutletById(String outletId) {
        return outletRepository.findById(outletId)
                .orElseThrow(() -> new OutletNotFoundException("Outlet not found with ID: " + outletId));
    }
    
//    public List<Discount> getValidDiscounts(String outletId) {
//    	
//        Outlet outlet = outletRepository.findById(outletId).orElse(null);
//        if (outlet == null) {
//            throw new OutletNotFoundException("Outlet not found with ID: " + outletId);
//        }
//
//        Date currentDate = new Date(System.currentTimeMillis());
//        Time currentTime = new Time(System.currentTimeMillis());
//        
//        return discountRepository
//                .findAll()
//                .stream()
//                .filter(discount ->
//                        discount.getStartDate().before(currentDate) &&
//                        discount.getEndDate().after(currentDate) &&
//                        discount.getStartTime().before(currentTime) &&
//                        discount.getEndTime().after(currentTime)
//                )
//                .toList(); 
//        
//    }
    
   
    
}
