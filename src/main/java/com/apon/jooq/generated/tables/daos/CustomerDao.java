/*
 * This file is generated by jOOQ.
 */
package com.apon.jooq.generated.tables.daos;


import com.apon.jooq.generated.tables.Customer;
import com.apon.jooq.generated.tables.records.CustomerRecord;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerDao extends DAOImpl<CustomerRecord, com.apon.jooq.generated.tables.pojos.Customer, Integer> {

    /**
     * Create a new CustomerDao without any configuration
     */
    public CustomerDao() {
        super(Customer.CUSTOMER, com.apon.jooq.generated.tables.pojos.Customer.class);
    }

    /**
     * Create a new CustomerDao with an attached configuration
     */
    public CustomerDao(Configuration configuration) {
        super(Customer.CUSTOMER, com.apon.jooq.generated.tables.pojos.Customer.class, configuration);
    }

    @Override
    public Integer getId(com.apon.jooq.generated.tables.pojos.Customer object) {
        return object.getCustomerid();
    }

    /**
     * Fetch records that have <code>CUSTOMERID BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.apon.jooq.generated.tables.pojos.Customer> fetchRangeOfCustomerid(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Customer.CUSTOMER.CUSTOMERID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>CUSTOMERID IN (values)</code>
     */
    public List<com.apon.jooq.generated.tables.pojos.Customer> fetchByCustomerid(Integer... values) {
        return fetch(Customer.CUSTOMER.CUSTOMERID, values);
    }

    /**
     * Fetch a unique record that has <code>CUSTOMERID = value</code>
     */
    public com.apon.jooq.generated.tables.pojos.Customer fetchOneByCustomerid(Integer value) {
        return fetchOne(Customer.CUSTOMER.CUSTOMERID, value);
    }

    /**
     * Fetch records that have <code>FIRSTNAME BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.apon.jooq.generated.tables.pojos.Customer> fetchRangeOfFirstname(String lowerInclusive, String upperInclusive) {
        return fetchRange(Customer.CUSTOMER.FIRSTNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>FIRSTNAME IN (values)</code>
     */
    public List<com.apon.jooq.generated.tables.pojos.Customer> fetchByFirstname(String... values) {
        return fetch(Customer.CUSTOMER.FIRSTNAME, values);
    }

    /**
     * Fetch records that have <code>LASTNAME BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.apon.jooq.generated.tables.pojos.Customer> fetchRangeOfLastname(String lowerInclusive, String upperInclusive) {
        return fetchRange(Customer.CUSTOMER.LASTNAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>LASTNAME IN (values)</code>
     */
    public List<com.apon.jooq.generated.tables.pojos.Customer> fetchByLastname(String... values) {
        return fetch(Customer.CUSTOMER.LASTNAME, values);
    }

    /**
     * Fetch records that have <code>TSCREATED BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.apon.jooq.generated.tables.pojos.Customer> fetchRangeOfTscreated(Timestamp lowerInclusive, Timestamp upperInclusive) {
        return fetchRange(Customer.CUSTOMER.TSCREATED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>TSCREATED IN (values)</code>
     */
    public List<com.apon.jooq.generated.tables.pojos.Customer> fetchByTscreated(Timestamp... values) {
        return fetch(Customer.CUSTOMER.TSCREATED, values);
    }

    /**
     * Fetch records that have <code>ISEXTERNALLYMANAGED BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<com.apon.jooq.generated.tables.pojos.Customer> fetchRangeOfIsexternallymanaged(String lowerInclusive, String upperInclusive) {
        return fetchRange(Customer.CUSTOMER.ISEXTERNALLYMANAGED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>ISEXTERNALLYMANAGED IN (values)</code>
     */
    public List<com.apon.jooq.generated.tables.pojos.Customer> fetchByIsexternallymanaged(String... values) {
        return fetch(Customer.CUSTOMER.ISEXTERNALLYMANAGED, values);
    }
}
