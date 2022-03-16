package com.extend.pay.apiexecutions.model.request.user;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SignIn {
    private String email;
    private String password;
}
