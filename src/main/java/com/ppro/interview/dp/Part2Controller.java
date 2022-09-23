package com.ppro.interview.dp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/part2")
@Slf4j
public class Part2Controller {
    /**
     * Part 2 of 3 - download bank's settlement file
     *
     * The bank's settlement file can be retrieved from an API that returns a JSON
     * containing a list of transactions. Our fake API endpoint is available as
     * `GET https://gitlab.com/snippets/1799690/raw`.
     *
     * Implement in the response function that:
     *   * fetches data from the endpoint above;
     *   * returns a map of `status -> txId[]` like:
     *     `{ statusA: [ 100, 101 ], statusB: [102, ...], ...}`;
     *   * is the module's default export;
     *
     * Additional info:
     *   * you don't have to handle errors, but adding a comment indicating
     *     where and what would you check is highly appreciated;
     */

    @GetMapping("")
    public String Part2Response() {
        log.info("Part 2 - Get Settlements");
        // Your code here


        // return your JSON string here with your values
        return "{\"failed\": [], \"ok\": [], \"waiting\": []}";
    }

}