/*
 * #%L
 * AIW i2b2 ETL
 * %%
 * Copyright (C) 2012 - 2013 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package edu.emory.cci.aiw.i2b2etl.dest.table;

import java.sql.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import edu.emory.cci.aiw.etl.table.AbstractRecord;

/**
 * Represents records in the patient dimension.
 *
 * The concept dimension has the following DDL:
 * <pre>
 * CREATE TABLE  "PATIENT_DIMENSION"
 *    	(
 *    	"PATIENT_NUM" 		NUMBER(38,0) NOT NULL ENABLE,
 *    	"VITAL_STATUS_CD" 	VARCHAR2(50),
 *    	"BIRTH_DATE" 		DATE,
 *    	"DEATH_DATE" 		DATE,
 *    	"SEX_CD" 			VARCHAR2(50),
 *    	"AGE_IN_YEARS_NUM" 	NUMBER(38,0),
 *    	"LANGUAGE_CD" 		VARCHAR2(50),
 *    	"RACE_CD" 			VARCHAR2(50),
 *    	"MARITAL_STATUS_CD" VARCHAR2(50),
 *    	"RELIGION_CD" 		VARCHAR2(50),
 *    	"ZIP_CD" 			VARCHAR2(10),
 *    	"STATECITYZIP_PATH" VARCHAR2(700),
 *    	"PATIENT_BLOB" 		CLOB,
 *    	"UPDATE_DATE" 		DATE,
 *    	"DOWNLOAD_DATE" 	DATE,
 *    	"IMPORT_DATE" 		DATE,
 *    	"SOURCESYSTEM_CD" 	VARCHAR2(50),
 *    	"UPLOAD_ID" 		NUMBER(38,0),
 *    	CONSTRAINT "PATIENT_DIMENSION_PK" PRIMARY KEY ("PATIENT_NUM")
 *    	)
 * </pre>
 *
 * @author Andrew Post
 */
public class PatientDimension extends AbstractRecord {
    
    private String encryptedPatientId;
    private String encryptedPatientIdSource;
    private Long ageInYears;
    private String zip;
    private String race;
    private String gender;
    private String language;
    private String maritalStatus;
    private String religion;
    private String vital;
    private Date birthDate;
    private Date deathDate;
    private String sourceSystem;
    private Timestamp downloaded;
    private Timestamp updated;
    private Timestamp deletedDate;

    public PatientDimension() {
        
    }

    public void setEncryptedPatientId(String encryptedPatientId) {
        this.encryptedPatientId = encryptedPatientId;
    }

    public void setEncryptedPatientIdSource(String encryptedPatientIdSource) {
        this.encryptedPatientIdSource = encryptedPatientIdSource;
    }

    public void setAgeInYears(Long ageInYears) {
        this.ageInYears = ageInYears;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public void setVital(String vital) {
        this.vital = vital;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public String getEncryptedPatientId() {
        return this.encryptedPatientId;
    }

    public String getEncryptedPatientIdSource() {
        return this.encryptedPatientIdSource;
    }

    public Long getAgeInYears() {
        return this.ageInYears;
    }
    
    public String getZip() {
        return zip;
    }

    public String getRace() {
        return race;
    }

    public String getGender() {
        return gender;
    }

    public String getLanguage() {
        return language;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getReligion() {
        return religion;
    }

    public String getVital() {
        return vital;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public Timestamp getDownloaded() {
        return downloaded;
    }

    public void setDownloaded(Timestamp downloaded) {
        this.downloaded = downloaded;
    }
    
    public Timestamp getUpdated() {
        return this.updated;
    }
    
    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public Timestamp getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Timestamp deletedDate) {
        this.deletedDate = deletedDate;
    }

}