package cucumber;

import com.google.common.base.CaseFormat;
public class Test {
    public static void main(String[] args) {
        /*System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_number")                  + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_number") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_date")                    + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_date") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_id")                       + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_id") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_site_id")                  + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_site_id") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_site_name")                + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_site_name") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_total")                   + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_total") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_currency")                + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_currency") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_status")                  + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_status") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "location_id")                     + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "location_id") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "location_name")                   + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "location_name") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "sanction_flag")                   + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "sanction_flag") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_type")                    + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_type") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "credit_reason")                   + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "credit_reason") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "hold_reason")                     + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "hold_reason") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "cancel_reason")                   + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "cancel_reason") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "source")                          + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "source") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "sold_to_number")                  + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "sold_to_number") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "ship_to_number")                  + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "ship_to_number") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_due_date")                + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_due_date") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "po_number")                       + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "po_number") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_received_date")           + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_received_date") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "segment")                         + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "segment") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "created_by")                      + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "created_by") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "updated_by")                      + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "updated_by") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "created_on")                      + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "created_on") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "updated_on")                      + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "updated_on") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_payment_method")          + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_payment_method") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "comments")                        + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "comments") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "user_assignee")                   + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "user_assignee") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "early_pay_discount")              + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "early_pay_discount") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "destination_location_override")   + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "destination_location_override") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_name")                     + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_name") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_exchange_rate")           + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_exchange_rate") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "local_currency")                  + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "local_currency") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "status")                          + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "status") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "version")                         + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "version") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "org_id")                          + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "org_id") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "company_id")                      + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "company_id") + ">\"");
        System.out.println("    And I set its field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "company_name")                    + "\"  with value \"<" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "company_name") + ">\"");
        System.out.println("    And I set its field \"lines\" to the following list of InvoiceLine");
        
        System.out.println("\n\n");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_number") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_date") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_id") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_site_id") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_site_name") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_total") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_currency") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_status") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "location_id") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "location_name") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "sanction_flag") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_type") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "credit_reason") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "hold_reason") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "cancel_reason") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "source") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "sold_to_number") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "ship_to_number") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_due_date") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "po_number") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_received_date") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "segment") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "created_by") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "updated_by") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "created_on") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "updated_on") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_payment_method") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "comments") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "user_assignee") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "early_pay_discount") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "destination_location_override") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_name") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_exchange_rate") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "local_currency") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "status") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "version") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "org_id") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "company_id") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "company_name") + "\" in response should not be null");
        System.out.println("    And Field \"" + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "lines") + "\" in response should not be null");
        System.out.println("\n\n");
        
        //Invoice
        System.out.println("| " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_number")  
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_date")                  
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_id")                     
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_site_id")                
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_site_name")              
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_total")                 
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_currency")              
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_status")                
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "location_id")                   
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "location_name")                 
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "sanction_flag")                 
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_type")                  
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "credit_reason")                 
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "hold_reason")                   
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "cancel_reason")                 
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "source")                        
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "sold_to_number")                
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "ship_to_number")                
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_due_date")              
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "po_number")                     
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_received_date")         
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "segment")                       
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "created_by")                    
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "updated_by")                    
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "created_on")                    
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "updated_on")                    
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_payment_method")        
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "comments")                      
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "user_assignee")                 
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "early_pay_discount")            
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "destination_location_override") 
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_name")                   
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_exchange_rate")         
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "local_currency")                
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "status")                        
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "version")                       
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "org_id")                        
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "company_id")                    
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "company_name")                  
                + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "lines") + " |");                   
    
        System.out.println("\n\n");
        //InvoiceLine
        System.out.println("| " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_line_id")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "line_type")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "item_id")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "item_name")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "uOM_code")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "bol_number")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "location_id")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "location_name")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "gross_quantity")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "net_quantity")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "unit_cost")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "extended_cost")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "gross_net_indicator")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "uplift_start_date")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "uplift_end_date")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "uplift_start_end_indicator")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "tail_number")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "flight_number")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "aircraft_type")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "dom_intl_indicator")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "parent_invoice_line_id")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "origination_location_id")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "origination_location_name")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "destination_location_id")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "destination_location_name")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "intermediate_location_id")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "intermediate_location_name")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "created_by")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "updated_by")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "created_on")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "updated_on")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "status")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "version")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "fob_point")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "available_gross_qty")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "available_net_qty")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "exchange_rate")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "exchange_rate_date")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "carrier_id")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "carrier_name")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "adj_density")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "alt_quantity")
        + " | " + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "alt_qty_uom") + " |");
         
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_number"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_date"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_id"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_site_id"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_site_name"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_total"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_currency"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_status"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "location_id"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "location_name"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "sanction_flag"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_type"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "credit_reason"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "hold_reason"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "cancel_reason"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "source"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "sold_to_number"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "ship_to_number"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_due_date"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "po_number"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_received_date"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "segment"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "created_by"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "updated_by"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "created_on"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "updated_on"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_payment_method"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "comments"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "user_assignee"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "early_pay_discount"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "destination_location_override"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "vendor_name"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_exchange_rate"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "local_currency"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "status"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "version"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "org_id"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "company_id"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "company_name"));
                System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "lines")));*/
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "invoice_line_id"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "line_type"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "item_id"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "item_name"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "uOM_code"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "bol_number"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "location_id"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "location_name"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "gross_quantity"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "net_quantity"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "unit_cost"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "extended_cost"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "gross_net_indicator"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "uplift_start_date"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "uplift_end_date"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "uplift_start_end_indicator"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "tail_number"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "flight_number"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "aircraft_type"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "dom_intl_indicator"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "parent_invoice_line_id"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "origination_location_id"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "origination_location_name"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "destination_location_id"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "destination_location_name"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "intermediate_location_id"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "intermediate_location_name"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "created_by"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "updated_by"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "created_on"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "updated_on"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "status"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "version"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "fob_point"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "available_gross_qty"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "available_net_qty"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "exchange_rate"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "exchange_rate_date"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "carrier_id"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "carrier_name"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "adj_density"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "alt_quantity"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "alt_qty_uom"));
    }

}
