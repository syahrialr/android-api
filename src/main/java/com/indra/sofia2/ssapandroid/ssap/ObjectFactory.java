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

package com.indra.sofia2.ssapandroid.ssap;

import javax.xml.namespace.QName;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gatewayhttp package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */

public class ObjectFactory {

    private final static QName SSAP_MESSAGE_QNAME = new QName("gatewayHttp", "ssapmessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gatewayhttp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ssapmessage }
     * 
     */
    public SSAPMessage createSsapmessage() {
        return new SSAPMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ssapmessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "gatewayHttp", name = "ssapmessage")
    public JAXBElement<SSAPMessage> createSsapmessage(SSAPMessage value) {
        return new JAXBElement<SSAPMessage>(SSAP_MESSAGE_QNAME, SSAPMessage.class, null, value);
    }
    


}
