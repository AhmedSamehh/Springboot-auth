package com.seha.springauth.payload.response;

import java.util.List;

public class UserInfoResponse {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private List<String> roles;

    public UserInfoResponse(Long id, String firstname, String lastname, String email, List<String> roles) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.roles = roles;
    }
}