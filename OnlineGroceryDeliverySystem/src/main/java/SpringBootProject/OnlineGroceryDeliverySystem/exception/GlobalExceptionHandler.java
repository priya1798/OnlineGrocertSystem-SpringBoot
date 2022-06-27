package SpringBootProject.OnlineGroceryDeliverySystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler (GivenIdNotFoundException.class)
	public ResponseEntity<Object> handleGivenIdNotFoundException(){
		return new ResponseEntity<Object>("Given Id is not available.", HttpStatus.NOT_FOUND) ;
	}
	
	@ExceptionHandler (RecordNotFoundException.class)
	public ResponseEntity<Object> handleRecordNotFoundException(){
		return new ResponseEntity<Object>("No record found.", HttpStatus.NOT_FOUND) ;
	}
	
	

	
	//private String resourceName;
	//private String fieldName;
	//private Object fieldValue;
	//public GlobalExceptionHandler(String resourceName, String fieldName, Object fieldValue) {
	//super(String.format(("* Resource Not Found *"),resourceName, fieldName,fieldValue));
	//	this.resourceName = resourceName;
	//this.fieldName = fieldName;
	//this.fieldValue = fieldValue;
		
		
	//}
	//public String getResourceName() {
	//return resourceName;
	//}
	
	//public String getFieldName() {
	//return fieldName;
	//}
	
	//public Object getFieldValue() {
	//	return fieldValue;
	//}
	
	
	
	
	
	
	

	
}
