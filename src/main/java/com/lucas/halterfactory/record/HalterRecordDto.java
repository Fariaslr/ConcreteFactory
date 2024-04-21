package com.lucas.halterfactory.record;

import jakarta.validation.constraints.NotNull;

public record HalterRecordDto (@NotNull float peso,@NotNull int quantidade){

}
