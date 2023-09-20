package com.dev.APIDiscount.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.APIDiscount.model.Outlet;

public interface OutletRepository extends JpaRepository<Outlet, String> {
}