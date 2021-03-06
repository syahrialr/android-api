/*******************************************************************************
 * Copyright 2013-16 Indra Sistemas S.A.
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
package com.indra.sofia2.ssapandroid.ssap.body.config.message;

import java.io.IOException;
import java.util.Collection;

import com.indra.sofia2.ssapandroid.json.JSON;
import com.indra.sofia2.ssapandroid.ssap.exceptions.SSAPMessageDeserializationError;

public class SSAPBodyConfigOntologia {
	private String identificacion;
	private String esquemajson;
	private String tipopermiso;

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getEsquemajson() {
		return esquemajson;
	}

	public void setEsquemajson(String esquemajson) {
		this.esquemajson = esquemajson;
	}

	public String getTipopermiso() {
		return tipopermiso;
	}

	public void setTipopermiso(String tipopermiso) {
		this.tipopermiso = tipopermiso;
	}

	public String toJson() {
		try {
			return JSON.serialize(this);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static String toJsonArray(Collection<SSAPBodyConfigOntologia> collection) {
		try {
			return JSON.serializeCollection(collection);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static SSAPBodyConfigOntologia fromJsonToSSAPBodyConfigOntologia(String json) {
		try {
			return JSON.deserialize(json, SSAPBodyConfigOntologia.class);
		} catch (IOException e) {
			throw new SSAPMessageDeserializationError(e);
		}
	}

	public static Collection<SSAPBodyConfigOntologia> fromJsonArrayToSSAPBodyConfigOntologia(String json) {
		try {
			return JSON.deserializeCollection(json, SSAPBodyConfigOntologia.class);
		} catch (IOException e) {
			throw new SSAPMessageDeserializationError(e);
		}
	}
}
