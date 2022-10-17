package com.paymentengine.www.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.paymentengine.www.model.FinanceQuoteRequest;
import com.paymentengine.www.model.FinanceQuoteResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
public class PaymentEngineController {

	@Operation(summary = "Calculate Finance Quote", description = "To produce finance quotes for multiple terms")
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json", value = "/calculateFinanceQuote")
	@ApiResponses(value = {@ApiResponse(responseCode = "200", description = "Fiance quotes produced successfully", content = @Content(schema = @Schema(implementation = FinanceQuoteResponse.class)))})
	public ResponseEntity<FinanceQuoteResponse> calculateFinanceQuote(@RequestBody FinanceQuoteRequest financeQuoteRequest) {
		return null;
	}
}
