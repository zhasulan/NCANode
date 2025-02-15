package kz.ncanode.api.core;

import kz.ncanode.api.ApiServiceProvider;
import kz.ncanode.api.exceptions.InvalidArgumentException;

public interface InputType {
    void setDependencies(ApiVersion apiVersion, ApiServiceProvider apiServiceProvider);
    void validate() throws InvalidArgumentException;
    void input(Object data);
}
