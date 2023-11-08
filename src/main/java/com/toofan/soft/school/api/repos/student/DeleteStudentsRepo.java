package com.toofan.soft.school.api.repos.student;

import com.toofan.soft.school.api.API;
import com.toofan.soft.school.api.APIException;

import java.rmi.RemoteException;
import java.util.List;

public interface DeleteStudentsRepo extends API {
    void execute(Request request) throws APIException, RemoteException;

    record Request (
            List<Integer> studentsIds
    ) {}
}
