CREATE OR REPLACE PACKAGE EUREKA
AS
PROCEDURE EK_CREATE_REJECTED_OBX_TBL (
    rejectedObxFactTableName IN VARCHAR,
    failIfExists IN NUMBER,
    errorMsg OUT VARCHAR );
    
PROCEDURE EK_CREATE_TEMP_PATIENT_TABLE(
    tempPatientDimensionTableName IN VARCHAR, 
    errorMsg OUT VARCHAR ) ;
    
PROCEDURE EK_INS_ENC_VISIT_FROM_TEMP(
    tempTableName IN VARCHAR,
    upload_id     IN NUMBER,
    errorMsg OUT VARCHAR ) ;
    
PROCEDURE EK_UPDATE_OBSERVATION_FACT(
    upload_temptable_name IN VARCHAR,
    upload_id             IN NUMBER,
    appendFlag            IN NUMBER,
    errorMsg OUT VARCHAR ) ;

PROCEDURE EK_INSERT_EID_MAP_FROMTEMP(
    tempEidTableName IN VARCHAR,  
    upload_id IN NUMBER,
    errorMsg OUT VARCHAR ) ;

PROCEDURE EK_INSERT_PID_MAP_FROMTEMP (
    tempPidTableName IN VARCHAR, 
    upload_id IN NUMBER, 
    errorMsg OUT VARCHAR ) ;

END EUREKA ;
