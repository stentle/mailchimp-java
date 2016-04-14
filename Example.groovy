package com.mailchimp

import com.mailchimp.domain.MemberCreate
import com.mailchimp.domain.MemberMergeFields
import com.mailchimp.domain.SubscribeStatus

class Example {

    public static void main(def args) {
        String listId = "3160d095b5"
        String apiKey = "APIKEY";
        String apiBase = "API BASE e.g. us8";
        MailChimpClient mailChimp = MailChimpFactory.createWithBasicAuth(apiKey, apiBase);
        MemberCreate memberCreate = new MemberCreate()
        memberCreate.setEmail("filippo.latorre@stentle.com");
        MemberMergeFields memberMerge = new MemberMergeFields();
        memberMerge.setFirstName("Filippo");
        memberMerge.setLastName("La Torre");
        memberCreate.setSubscribeStatus(SubscribeStatus.Subscribed);
        memberCreate.setMemberMergeFields(memberMerge);
        println mailChimp.createMember(listId,memberCreate);
    }
}
