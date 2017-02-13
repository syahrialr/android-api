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

import com.indra.sofia2.ssapandroid.json.JSON;
import com.indra.sofia2.ssapandroid.ssap.exceptions.SSAPMessageDeserializationError;



public class SSAPBodyUnsubscribeMessage extends SSAPBodyMessage {

	private String idSuscripcion;		
	
	
	
	public String getIdSuscripcion() {
		return idSuscripcion;
	}



	public void setIdSuscripcion(String idSuscripcion) {
		this.idSuscripcion = idSuscripcion;
	}



	public static SSAPBodyUnsubscribeMessage fromJsonToSSAPBodyUnsubscribeMessage(String json) {
		try {
			return JSON.deserialize(json, SSAPBodyUnsubscribeMessage.class);
		} catch (IOException e) {
			throw new SSAPMessageDeserializationError(e);
		}
	}
}
