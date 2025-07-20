/**
 * Author: Gorre Jaya Sai
 * Controller that handles account-related API endpoints.
 */
package com.cognizant.account.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{accountNumber}")
    public Map<String, Object> getAccount(@PathVariable String accountNumber) {
        Map<String, Object> accountDetails = new HashMap<>();
        accountDetails.put("accountNumber", accountNumber);
        accountDetails.put("accountType", "Savings");
        accountDetails.put("balance", 234343);
        accountDetails.put("currency", "INR");
        accountDetails.put("ownerName", "John Doe");
        return accountDetails;
    }
}
