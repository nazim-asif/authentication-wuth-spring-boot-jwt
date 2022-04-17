package com.sha.springbootauthentication.service;

import com.sha.springbootauthentication.model.User;


public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}
