/**
 * Author: Gorre Jaya Sai
 * Controller that handles loan-related API endpoints.
 */
package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{loanNumber}")
    public Map<String, Object> getLoan(@PathVariable("loanNumber") String loanNumber) {
        Map<String, Object> loanDetails = new HashMap<>();
        loanDetails.put("loanNumber", loanNumber);
        loanDetails.put("loanType", "Car");
        loanDetails.put("loanAmount", 400000);
        loanDetails.put("emi", 3258);
        loanDetails.put("tenureInMonths", 18);
        loanDetails.put("borrowerName", "Gorre Jaya Sai");
        return loanDetails;
    }
}
