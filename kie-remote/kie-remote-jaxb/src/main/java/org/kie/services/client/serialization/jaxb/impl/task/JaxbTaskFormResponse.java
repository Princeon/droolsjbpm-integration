/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.kie.services.client.serialization.jaxb.impl.task;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.kie.services.client.serialization.jaxb.rest.AbstractJaxbResponse;

@XmlRootElement(name="task-form-response")
@XmlAccessorType(XmlAccessType.FIELD)
public class JaxbTaskFormResponse extends AbstractJaxbResponse {

    @XmlElement
    private String formUrl;

    public JaxbTaskFormResponse() {
        // Default Constructor
    }

    public JaxbTaskFormResponse(String formUrl) {
        this.formUrl = formUrl;
    }

    public JaxbTaskFormResponse(String formUrl, String requestUrl) {
        super(requestUrl);
        this.formUrl = formUrl;
    }

    public String getFormUrl() {
        return formUrl;
    }
}
