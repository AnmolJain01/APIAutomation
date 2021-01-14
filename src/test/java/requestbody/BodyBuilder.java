package requestbody;

import com.google.gson.Gson;
import payload.*;

public class BodyBuilder {

    public String getCreateUserBody(String name, String job){
        return new Gson()
                .toJson(CreateUserPayload
                        .builder()
                        .name(name)
                        .job(job)
                        .build());
    }

    public String getUpdateUserBody(String name, String job){
        return new Gson()
                .toJson(UpdateUserPayload
                        .builder()
                        .name(name)
                        .job(job)
                        .build());
    }

    public String getRegisterUserBody(String email, String password){
        return new Gson()
                .toJson(RegisterUserPayload.builder()
                        .email(email)
                        .password(password)
                        .build());
    }

    public String getUnsuccessfulRegisterUserBody(String email){
        return new Gson()
                .toJson(UnsuccessfulRegisterUserPayload.builder()
                        .email(email)
                        .build());
    }

    public String getLoginUserBody(String email, String password){
        return new Gson()
                .toJson(LoginUserPayload.builder()
                        .email(email)
                        .password(password)
                        .build());
    }

    public String getUnsuccessfulLoginUserBody(String email){
        return new Gson()
                .toJson(UnsuccessfulLoginUserPayload.builder()
                        .email(email)
                        .build());
    }

    public String getUpdateUserPutBody(String name, String job){
        return new Gson()
                .toJson(UpdateUserPutPayload
                        .builder()
                        .name(name)
                        .job(job)
                        .build());
    }
}