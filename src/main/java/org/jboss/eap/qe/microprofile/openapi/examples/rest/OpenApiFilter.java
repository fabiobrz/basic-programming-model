package org.jboss.eap.qe.microprofile.openapi.examples.rest;

import org.eclipse.microprofile.openapi.OASFilter;
import org.eclipse.microprofile.openapi.models.Operation;

/**
 * A filter to make final configuration changes to the produced OpenAPI document.
 */
public class OpenApiFilter implements OASFilter {
    /**
     * Replaces some generated text
     */
    @Override
    public Operation filterOperation(Operation operation) {
        if ((operation.getOperationId() != null) && !"".equals(operation.getOperationId())) {
            operation.setSummary(operation.getSummary() + " (modified by filter)");
        }
        return operation;
    }
}
