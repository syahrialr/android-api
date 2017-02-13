/*******************************************************************************
 * Copyright 2013-15 Indra Sistemas S.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 ******************************************************************************/
package com.indra.sofia2.ssapandroid.ssap.body;

import java.io.IOException;
import java.util.Collection;

import com.indra.sofia2.ssapandroid.json.JSON;
import com.indra.sofia2.ssapandroid.ssap.SSAPSeverityLevel;
import com.indra.sofia2.ssapandroid.ssap.exceptions.SSAPMessageDeserializationError;

public class SSAPBodyErrorMessage extends SSAPBodyMessage {

	private String thinkp;

	private String instanciathinkp;
	
	private String token;
	
	private String owner;
	
	private SSAPSeverityLevel severity;
	
	private String code;

	private String message;
	
	private String timestamp;
	
	public String getThinkp() {
		return thinkp;
	}

	public void setThinkp(String thinkp) {
		this.thinkp = thinkp;
	}

	public String getInstanciathinkp() {
		return instanciathinkp;
	}

	public void setInstanciathinkp(String instanciathinkp) {
		this.instanciathinkp = instanciathinkp;
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public SSAPSeverityLevel getSeverity() {
		return severity;
	}

	public void setSeverity(SSAPSeverityLevel severity) {
		this.severity = severity;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public static SSAPBodyErrorMessage fromJsonToSSAPBodyErrorMessage(
			String json) {
		try {
			return JSON.deserialize(json, SSAPBodyErrorMessage.class);
		} catch (IOException e) {
			throw new SSAPMessageDeserializationError(e);
		}
	}

//	public static String toJsonArray(
//			Collection<SSAPBodyErrorMessage> collection) {
//		try {
//			return JSON.serializeCollection(collection);
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
//	}

//	public static String toJsonArray(
//			Collection<SSAPBodyErrorMessage> collection, String[] fields) {
//		return new JSONSerializer().include(fields).exclude("*.class")
//				.serialize(collection);
//	}

	public static Collection<SSAPBodyErrorMessage> fromJsonArrayToSSAPBodyErrorMessages(
			String json) {
		try {
			return JSON.deserializeCollection(json, SSAPBodyErrorMessage.class);
		} catch (IOException e) {
			throw new SSAPMessageDeserializationError(e);
		}
	}

}
