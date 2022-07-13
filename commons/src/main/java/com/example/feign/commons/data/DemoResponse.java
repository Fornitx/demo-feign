package com.example.feign.commons.data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record DemoResponse(
    @NotNull
    Integer id,

    @NotBlank
    String str
) {
}
