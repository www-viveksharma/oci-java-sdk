/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.announcementsservice.responses;

import com.oracle.bmc.announcementsservice.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class UpdateAnnouncementUserStatusResponse {

    /**
     *
     */
    private String opcRequestId;

    /**
     *
     */
    private String etag;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateAnnouncementUserStatusResponse o) {
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());

            return this;
        }
    }
}
