package org.WonyoungPark.api.security.service;
public interface SecurityService<T> {
    boolean validate();
    T getData();
}