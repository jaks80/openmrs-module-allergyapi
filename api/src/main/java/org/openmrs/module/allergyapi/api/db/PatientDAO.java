/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.allergyapi.api.db;

import java.util.List;

import org.openmrs.Patient;
import org.openmrs.module.allergyapi.Allergies;
import org.openmrs.module.allergyapi.Allergy;
import org.openmrs.module.allergyapi.api.PatientService;

/**
 * Database methods for {@link PatientService}.
 */
public interface PatientDAO {
	
	/**
	 * Gets a list of allergies that a patient has
	 * 
	 * @param patient the patient
	 * @return the allergy list
	 */
	List<Allergy> getAllergies(Patient patient);
	
	/**
	 * Gets a patient's allergy status
	 * 
	 * @param patient the patient
	 * @return the allergy status
	 */
	String getAllergyStatus(Patient patient);
	
	/**
	 * Saves patient allergies to the database.
	 * 
	 * @param patient the patient
	 * @param allergies the allergies
	 * @return the saved allergies
	 */
	Allergies saveAllergies(Patient patient, Allergies allergies);
	
	/**
	 * Saves an allergy to the database
	 * 
	 * @param allergy the allergy to save
	 * @return the saved allergy
	 */
	Allergy saveAllergy(Allergy allergy);
}
