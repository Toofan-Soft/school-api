package com.toofan.soft.school.api.repos.governorate;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface ModifyGovernoratesRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Governorate> governorates
    ) {}

    record Governorate (
            int id,
            String name
    ) {}
}
