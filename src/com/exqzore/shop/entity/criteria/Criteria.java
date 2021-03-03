package com.exqzore.shop.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria {
    private String groupSearchName;

    private final Map<String, Object> criteria = new HashMap<>();

    public Criteria() {
    }

    public Criteria(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    public void setGroupSearchName(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public void add(String searchCriteria, Object value) {
        criteria.put(searchCriteria, value);
    }

    public Set<String> getSearchCriteria() {
        return criteria.keySet();
    }

    public void remove(String searchCriteria) {
        criteria.remove(searchCriteria);
    }

    public int size() {
        return criteria.size();
    }

    public boolean isEmpty() {
        return criteria.isEmpty();
    }

    public boolean containsCriteria(String searchCriteria) {
        return criteria.containsKey(searchCriteria);
    }

    public Object get(String searchCriteria) {
        return criteria.get(searchCriteria);
    }
}
