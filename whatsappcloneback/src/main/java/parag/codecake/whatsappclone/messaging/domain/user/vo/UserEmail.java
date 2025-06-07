package parag.codecake.whatsappclone.messaging.domain.user.vo;

import parag.codecake.whatsappclone.shared.error.domain.Assert;

public record UserEmail(String value) {
    public UserEmail {
        Assert.field(value, value).maxLength(255);
    }
}
