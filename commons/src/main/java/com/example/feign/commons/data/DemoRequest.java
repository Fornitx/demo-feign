package com.example.feign.commons.data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record DemoRequest(
    @NotNull
    @Min(1)
    Integer id,

    @NotBlank
    String str
) {
}
