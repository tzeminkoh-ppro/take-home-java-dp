package com.ppro.interview.dp;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/part1")
@Slf4j
public class Part1Controller {
    /* Part 1 of 3 - Load PPRO's Transactions
     * In this part you should get transaction information from a CSV file.
     *
     * Implement in the response function that:
     *   * reads the contents from `../data/ppro-transactions.csv`, which contains
     *     a list of PPRO's transactions;
     *   * converts the information from the CSV into a `status -> txId[]` map:
     *     `{ statusA: ["TX01", "TX02"], statusB: ["TX03", ...], ...}`;
     *   * returns the above mentioned map in JSON;
     *
     * Additional info:
     *   * you don't have to handle errors, but adding a comment indicating
     *     where and what would you check is highly appreciated;
     */

    @GetMapping("")
    public String Part1Response() {
        log.info("Part 1 - Get Transactions");
        // Your code here


        // return your JSON string here with your values
        return "{\"ERROR\": [], \"PENDING\": [], \"SUCCESS\": []}";
    }

}