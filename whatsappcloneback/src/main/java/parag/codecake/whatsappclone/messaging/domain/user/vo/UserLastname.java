package parag.codecake.whatsappclone.messaging.domain.user.vo;

import parag.codecake.whatsappclone.shared.error.domain.Assert;

public record UserLastname(String value) {
    public UserLastname {
        Assert.field(value, value).maxLength(255);
    }
}
