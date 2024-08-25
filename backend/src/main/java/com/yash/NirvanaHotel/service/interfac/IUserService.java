package com.yash.NirvanaHotel.service.interfac;

import com.yash.NirvanaHotel.dto.LoginRequest;
import com.yash.NirvanaHotel.dto.Response;
import com.yash.NirvanaHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
