package com.movieapp.exceptions;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.movieapp.model.ApiErrors;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message = ex.getMessage();
		List<Object> error = Arrays.asList("This method is not supported", ex.getMessage() + "not supported");
		HttpHeaders httpHeaders = new HttpHeaders();
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		return ResponseEntity.status(status).headers(httpHeaders).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message = ex.getMessage();
		List<Object> error = Arrays.asList("This mediatype  is not supported", ex.getContentType() + "not supported",
				ex.getMessage());
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "Invalid mediatype");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		return ResponseEntity.status(status).headers(httpHeaders).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message = ex.getMessage();
		List<Object> error = Arrays.asList("pathVariable missing", ex.getVariableName() + "variable not found",
				ex.getMessage());
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "Invalid variable");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		return ResponseEntity.status(status).headers(httpHeaders).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message = ex.getMessage();
		List<Object> error = Arrays.asList("This request para is missing",
				ex.getParameterName() + "is missing" + ex.getParameterType() + "is excepted");
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "Invalid variable");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		return ResponseEntity.status(status).headers(httpHeaders).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		String message = ex.getMessage();
		List<Object> error = Arrays.asList("Type miss match", ex.getRequiredType() + "is missing");
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "Invalid requestparam");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, status, status.value(), error);
		return ResponseEntity.status(status).headers(httpHeaders).body(errors);
	}

	@ExceptionHandler(MovieNotFoundException.class)
	public ResponseEntity<Object> handleBookNotFound(MovieNotFoundException ex) {
		String message = ex.getMessage();

		List<Object> error = Arrays.asList("Movie not available");
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "book not found");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, HttpStatus.INTERNAL_SERVER_ERROR,
				HttpStatus.INTERNAL_SERVER_ERROR.value(), error);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(httpHeaders).body(errors);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleException(Exception ex) {
		String message = ex.getMessage();

		List<Object> error = Arrays.asList("Other");
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", " not found");
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), message, HttpStatus.INTERNAL_SERVER_ERROR,
				HttpStatus.INTERNAL_SERVER_ERROR.value(), error);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(httpHeaders).body(errors);
}
}