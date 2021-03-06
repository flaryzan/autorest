/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for the ParameterGrouping_postMultiParamGroups
 * operation.
 */
public class ParameterGroupingPostMultiParamGroupsSecondParamGroupInner {
    /**
     * The headerTwo property.
     */
    @JsonProperty(value = "")
    private String headerTwo;

    /**
     * Query parameter with default.
     */
    @JsonProperty(value = "")
    private Integer queryTwo;

    /**
     * Get the headerTwo value.
     *
     * @return the headerTwo value
     */
    public String headerTwo() {
        return this.headerTwo;
    }

    /**
     * Set the headerTwo value.
     *
     * @param headerTwo the headerTwo value to set
     * @return the ParameterGroupingPostMultiParamGroupsSecondParamGroupInner object itself.
     */
    public ParameterGroupingPostMultiParamGroupsSecondParamGroupInner withHeaderTwo(String headerTwo) {
        this.headerTwo = headerTwo;
        return this;
    }

    /**
     * Get the queryTwo value.
     *
     * @return the queryTwo value
     */
    public Integer queryTwo() {
        return this.queryTwo;
    }

    /**
     * Set the queryTwo value.
     *
     * @param queryTwo the queryTwo value to set
     * @return the ParameterGroupingPostMultiParamGroupsSecondParamGroupInner object itself.
     */
    public ParameterGroupingPostMultiParamGroupsSecondParamGroupInner withQueryTwo(Integer queryTwo) {
        this.queryTwo = queryTwo;
        return this;
    }

}
