package com.toofan.soft.school.api.repos.governorate;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface AddGovernoratesRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Country> countries
    ) {}

    record Country (
            int id,
            List<String> governoratesNames
    ) {}
}
