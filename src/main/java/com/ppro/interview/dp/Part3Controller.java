package com.ppro.interview.dp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/part3")
@Slf4j
public class Part3Controller {
    /**
     * Part 3 of 3 - match settlement data
     *
     * Now that we have data from both sources we can match the transactions
     * and look for ambiguities.
     *
     * Implement in the response function that:
     *   * uses the `getSettlements()` and `getTransactions()` functions which
     *     we created in the previous steps
     *   * returns a map with a list of "good" (matching) transactions and a list
     *     of "bad" (mismatching) transactions, and a list of transactions that
     *     are missing on either side
     *     `{ matched: [ 100, 101 ], mismatched: [102, ...], missing: [103, ...]}`;
     *
     * Additional info:
     *   * you don't have to handle errors, but adding a comment indicating
     *     where and what would you check is highly appreciated;
     *   * we favour readability over speed!
     */

    @GetMapping("")
    public String Part3Response() {
        log.info("Part 3 - Match Transactions!");
        // Your code here


        // return your JSON string here with your values
        return "{\"matched\": [], \"mismatched\": [], \"missing\": []}";
    }

}