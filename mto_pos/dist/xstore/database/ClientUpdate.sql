 -- *******************************************
-- TILL SUMMARY REPORT NewTillReport
-- *******************************************
DELETE FROM RPT_ORGANIZER_P WHERE  organization_id = $(OrgID);
Insert into RPT_ORGANIZER_P (ORGANIZATION_ID,REPORT_NAME,REPORT_GROUP,REPORT_ELEMENT,PROPERTY_CODE,TYPE,STRING_VALUE,DATE_VALUE,DECIMAL_VALUE,CREATE_DATE,CREATE_USER_ID,UPDATE_DATE,UPDATE_USER_ID,RECORD_STATE) 
values ($(OrgID),'TSR_REPORT','SALE','NETSALES','TSR_DATE','DATE','1002',GETUTCDATE(),2,GETUTCDATE(),'BASEDATA',GETUTCDATE(),'BASEDATA',null);

-- *******************************************
-- TILL SUMMARY REPORT
-- *******************************************

COMMIT;