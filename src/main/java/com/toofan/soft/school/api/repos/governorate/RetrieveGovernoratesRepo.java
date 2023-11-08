package com.toofan.soft.school.api.repos.governorate;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface RetrieveGovernoratesRepo extends API {
    Response execute(Request request) throws APIException, RemoteException;

    record Request (
            int countryId
    ) {}

    record Response (
            List<Country> countries
    ) {}

    record Country (
            int id,
            List<Governorate> governorates
    ) {}

    record Governorate (
            int id,
            String name
    ) {}
}
