package com.example.vendor.config;

import com.example.vendor.entity.Vendor;
import com.example.vendor.repository.VendorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    private final VendorRepository repo;

    public DataSeeder(VendorRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {

        if (repo.count() > 0) return;

        repo.saveAll(List.of( new Vendor(null, "Tata Tech", "tata@tech.com", "ACTIVE", 85, LocalDate.now()),
                new Vendor(null, "Infosys", "info@infy.com", "ACTIVE", 90, LocalDate.now()),
                new Vendor(null, "Wipro", "wipro@wipro.com", "INACTIVE", 70, LocalDate.now()),
                new Vendor(null, "HCL", "hcl@hcl.com", "ACTIVE", 88, LocalDate.now()),
                new Vendor(null, "TechM", "techm@tech.com", "ACTIVE", 80, LocalDate.now()),

                new Vendor(null, "Capgemini", "cap@cap.com", "ACTIVE", 75, LocalDate.now()),
                new Vendor(null, "Accenture", "acc@acc.com", "ACTIVE", 92, LocalDate.now()),
                new Vendor(null, "Cognizant", "cog@cog.com", "INACTIVE", 68, LocalDate.now()),
                new Vendor(null, "IBM", "ibm@ibm.com", "ACTIVE", 95, LocalDate.now()),
                new Vendor(null, "Google", "google@google.com", "ACTIVE", 98, LocalDate.now()),

                new Vendor(null, "Amazon", "aws@amazon.com", "ACTIVE", 97, LocalDate.now()),
                new Vendor(null, "Microsoft", "ms@microsoft.com", "ACTIVE", 96, LocalDate.now()),
                new Vendor(null, "Zoho", "zoho@zoho.com", "ACTIVE", 83, LocalDate.now()),
                new Vendor(null, "Freshworks", "fresh@fresh.com", "INACTIVE", 72, LocalDate.now()),
                new Vendor(null, "Flipkart", "flip@flip.com", "ACTIVE", 89, LocalDate.now())
        ));
    }
}