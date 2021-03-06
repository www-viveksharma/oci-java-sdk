/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.filestorage.requests;

import com.oracle.bmc.filestorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class GetSnapshotRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The OCID of the snapshot.
     */
    private String snapshotId;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetSnapshotRequest o) {
            snapshotId(o.getSnapshotId());
            invocationCallback(o.getInvocationCallback());
            return this;
        }

        /**
         * Build the instance of GetSnapshotRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetSnapshotRequest
         */
        public GetSnapshotRequest build() {
            GetSnapshotRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
