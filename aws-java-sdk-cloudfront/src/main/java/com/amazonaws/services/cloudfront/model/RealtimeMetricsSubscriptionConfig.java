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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A subscription configuration for additional CloudWatch metrics.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/RealtimeMetricsSubscriptionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealtimeMetricsSubscriptionConfig implements Serializable, Cloneable {

    /**
     * <p>
     * A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
     * </p>
     */
    private String realtimeMetricsSubscriptionStatus;

    /**
     * <p>
     * A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
     * </p>
     * 
     * @param realtimeMetricsSubscriptionStatus
     *        A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront
     *        distribution.
     * @see RealtimeMetricsSubscriptionStatus
     */

    public void setRealtimeMetricsSubscriptionStatus(String realtimeMetricsSubscriptionStatus) {
        this.realtimeMetricsSubscriptionStatus = realtimeMetricsSubscriptionStatus;
    }

    /**
     * <p>
     * A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
     * </p>
     * 
     * @return A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront
     *         distribution.
     * @see RealtimeMetricsSubscriptionStatus
     */

    public String getRealtimeMetricsSubscriptionStatus() {
        return this.realtimeMetricsSubscriptionStatus;
    }

    /**
     * <p>
     * A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
     * </p>
     * 
     * @param realtimeMetricsSubscriptionStatus
     *        A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront
     *        distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealtimeMetricsSubscriptionStatus
     */

    public RealtimeMetricsSubscriptionConfig withRealtimeMetricsSubscriptionStatus(String realtimeMetricsSubscriptionStatus) {
        setRealtimeMetricsSubscriptionStatus(realtimeMetricsSubscriptionStatus);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
     * </p>
     * 
     * @param realtimeMetricsSubscriptionStatus
     *        A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront
     *        distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RealtimeMetricsSubscriptionStatus
     */

    public RealtimeMetricsSubscriptionConfig withRealtimeMetricsSubscriptionStatus(RealtimeMetricsSubscriptionStatus realtimeMetricsSubscriptionStatus) {
        this.realtimeMetricsSubscriptionStatus = realtimeMetricsSubscriptionStatus.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRealtimeMetricsSubscriptionStatus() != null)
            sb.append("RealtimeMetricsSubscriptionStatus: ").append(getRealtimeMetricsSubscriptionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealtimeMetricsSubscriptionConfig == false)
            return false;
        RealtimeMetricsSubscriptionConfig other = (RealtimeMetricsSubscriptionConfig) obj;
        if (other.getRealtimeMetricsSubscriptionStatus() == null ^ this.getRealtimeMetricsSubscriptionStatus() == null)
            return false;
        if (other.getRealtimeMetricsSubscriptionStatus() != null
                && other.getRealtimeMetricsSubscriptionStatus().equals(this.getRealtimeMetricsSubscriptionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRealtimeMetricsSubscriptionStatus() == null) ? 0 : getRealtimeMetricsSubscriptionStatus().hashCode());
        return hashCode;
    }

    @Override
    public RealtimeMetricsSubscriptionConfig clone() {
        try {
            return (RealtimeMetricsSubscriptionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
