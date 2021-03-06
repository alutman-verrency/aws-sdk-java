/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ec2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * GetAssociatedIpv6PoolCidrsRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAssociatedIpv6PoolCidrsRequestMarshaller implements Marshaller<Request<GetAssociatedIpv6PoolCidrsRequest>, GetAssociatedIpv6PoolCidrsRequest> {

    public Request<GetAssociatedIpv6PoolCidrsRequest> marshall(GetAssociatedIpv6PoolCidrsRequest getAssociatedIpv6PoolCidrsRequest) {

        if (getAssociatedIpv6PoolCidrsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetAssociatedIpv6PoolCidrsRequest> request = new DefaultRequest<GetAssociatedIpv6PoolCidrsRequest>(getAssociatedIpv6PoolCidrsRequest,
                "AmazonEC2");
        request.addParameter("Action", "GetAssociatedIpv6PoolCidrs");
        request.addParameter("Version", "2016-11-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (getAssociatedIpv6PoolCidrsRequest.getPoolId() != null) {
            request.addParameter("PoolId", StringUtils.fromString(getAssociatedIpv6PoolCidrsRequest.getPoolId()));
        }

        if (getAssociatedIpv6PoolCidrsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(getAssociatedIpv6PoolCidrsRequest.getNextToken()));
        }

        if (getAssociatedIpv6PoolCidrsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(getAssociatedIpv6PoolCidrsRequest.getMaxResults()));
        }

        return request;
    }

}
