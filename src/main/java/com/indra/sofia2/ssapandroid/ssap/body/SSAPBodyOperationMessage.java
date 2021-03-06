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


import com.indra.sofia2.ssapandroid.ssap.exceptions.SSAPMessageDeserializationError;
import com.indra.sofia2.ssapandroid.json.JSON;
import com.indra.sofia2.ssapandroid.ssap.SSAPQueryType;


public class SSAPBodyOperationMessage extends SSAPBodyMessage  {
	
	/*
	 * Mensaje enviado
	 */
//	private String data;
	
	/*
	 * Query enviada
	 */
	private String query;
	
	private SSAPQueryType queryType;
	
	/*public void setData(String datos) {
		this.data = prepareQuotes(datos);
	}*/
	public void setQuery(String query) {
		this.query = prepareQuotes(query);
	}
	public void setQueryType(SSAPQueryType queryType) {
		this.queryType = queryType;
	}	
	
	
	/*public String getData() {
		return data;
	}*/
	public String getQuery() {
		return query;
	}
	public SSAPQueryType getQueryType() {
		return queryType;
	}
	
	public static SSAPBodyOperationMessage fromJsonToSSAPBodyOperationMessage(String json) {
		json = json.replaceAll(SSAPBodyQueryMessage.class.getSimpleName(), SSAPBodyOperationMessage.class.getSimpleName());
		json = json.replaceAll(SSAPBodyQueryWithParamMessage.class.getSimpleName(), SSAPBodyOperationMessage.class.getSimpleName());
		try {
			return JSON.deserialize(json, SSAPBodyOperationMessage.class);
		} catch (IOException e) {
			throw new SSAPMessageDeserializationError(e);
		}
	}
	
	public String toJson(SSAPBodyOperationMessage body) {
		try {
			return JSON.serialize(body);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
