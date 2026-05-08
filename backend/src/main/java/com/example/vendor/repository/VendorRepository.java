package com.example.vendor.repository;

import com.example.vendor.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface VendorRepository extends JpaRepository<Vendor, Long> {

    List<Vendor> findByNameContainingIgnoreCase(String name);

    List<Vendor> findByStatus(String status);

    List<Vendor> findByCreatedDateBetween(LocalDate from, LocalDate to);

    @Query("SELECT v FROM Vendor v JOIN FETCH v.reviews")
    List<Vendor> findAllWithReviews();
}