@Invoice 
Feature: Invoice services 
	As an Invoice service consumer
  I want to be able to create a draft, read and update Inovoices

Scenario Outline: Create a new Invoice header 
	Given I have an empty Invoice header object 
	And I set its field "invoice_id" with value "<invoice_id>" 
	And I set its field "invoice_number" with value "<invoice_number>" 
	And I set its field "invoice_date" with value "<invoice_date>" 
	And I set its field "vendor_id" with value "<vendor_id>" 
	And I set its field "vendor_site_id" with value "<vendor_site_id>" 
	And I set its field "vendor_site_name" with value "<vendor_site_name>" 
	And I set its field "invoice_total" with value "<invoice_total>" 
	And I set its field "invoice_currency" with value "<invoice_currency>" 
	And I set its field "invoice_status" with value "<invoice_status>" 
	And I set its field "location_id" with value "<location_id>" 
	And I set its field "location_name" with value "<location_name>" 
	And I set its field "sanction_flag" with value "<sanction_flag>" 
	And I set its field "invoice_type" with value "<invoice_type>" 
	And I set its field "credit_reason" with value "<credit_reason>" 
	And I set its field "hold_reason" with value "<hold_reason>" 
	And I set its field "cancel_reason" with value "<cancel_reason>" 
	And I set its field "source" with value "<source>" 
	And I set its field "sold_to_number" with value "<sold_to_number>" 
	And I set its field "ship_to_number" with value "<ship_to_number>" 
	And I set its field "invoice_due_date" with value "<invoice_due_date>" 
	And I set its field "po_number" with value "<po_number>" 
	And I set its field "invoice_received_date" with value "<invoice_received_date>" 
	And I set its field "segment" with value "<segment>" 
	And I set its field "created_by" with value "<created_by>" 
	And I set its field "updated_by" with value "<updated_by>" 
	And I set its field "created_on" with value "<created_on>" 
	And I set its field "updated_on" with value "<updated_on>" 
	And I set its field "invoice_payment_method" with value "<invoice_payment_method>" 
	And I set its field "comments" with value "<comments>" 
	And I set its field "user_assignee" with value "<user_assignee>" 
	And I set its field "early_pay_discount" with value "<early_pay_discount>" 
	And I set its field "destination_location_override    " with value "<destination_location_override>" 
	And I set its field "vendor_name" with value "<vendor_name>" 
	And I set its field "invoice_exchange_rate" with value "<invoice_exchange_rate>" 
	And I set its field "local_currency" with value "<local_currency>" 
	And I set its field "status" with value "<status>" 
	And I set its field "version" with value "<version>" 
	And I set its field "org_id" with value "<org_id>" 
	And I set its field "company_id" with value "<company_id>" 
	And I set its field "company_name" with value "<company_name>" 
	And I set its field "lines" with value "<lines>" 
	
	
	
	
	
	
	When I send it as POST operation to "/locations" 
	Then Service response code should be 200 
	And I should receive a Invoice object response 
	And Field "Location Id" in response should not be null 
	And Field "Request Id" in response should not be null 
	And Field "Address 1" in response should be "<Address 1>" 
	And I make a note of the "Location Id" value in the response 
	
	Examples: 
		| invoice_id | invoice_number | invoice_date | vendor_id | vendor_site_id | vendor_site_name | invoice_total | invoice_currency | invoice_status | location_id | location_name | sanction_flag | invoice_type | credit_reason | hold_reason | cancel_reason | source | sold_to_number | ship_to_number | invoice_due_date | po_number | invoice_received_date | segment | created_by | updated_by | created_on | updated_on | invoice_payment_method | comments | user_assignee | early_pay_discount | destination_location_override | vendor_name | invoice_exchange_rate | local_currency | status | version | org_id | company_id | company_name | lines |
		
		
		#DATA TYPES FROM INVOICES
		#boolean
		#decimal
		#int
		#map<int,frozen <invoice_line>>
		#text
		#timestamp
		#uuid      
		
		#se envia al servicio de crear el invoice completo o se puede enviar por partes header y luego line details cada una?