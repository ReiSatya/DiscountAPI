package com.dev.APIDiscount.repository;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.APIDiscount.model.Discount;

public interface DiscountRepository extends JpaRepository<Discount, String> {

}