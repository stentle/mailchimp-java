package com.mailchimp.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MemberCreate
{
    @JsonProperty(value = JsonConstants.MERGE_FIELDS)
    protected MemberMergeFields memberMergeFields;

    @JsonProperty(value = JsonConstants.EMAIL, required = true)
    protected String email;

    @JsonProperty(value = JsonConstants.STATUS)
    protected SubscribeStatus subscribeStatus;

    public MemberMergeFields getMemberMergeFields() {
        return memberMergeFields;
    }

    public void setMemberMergeFields(MemberMergeFields memberMergeFields) {
        this.memberMergeFields = memberMergeFields;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SubscribeStatus getSubscribeStatus() {
        return subscribeStatus;
    }

    public void setSubscribeStatus(SubscribeStatus subscribeStatus) {
        this.subscribeStatus = subscribeStatus;
    }
}
