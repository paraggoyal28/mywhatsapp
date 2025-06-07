package parag.codecake.whatsappclone.messaging.domain.user.vo;

import parag.codecake.whatsappclone.shared.error.domain.Assert;

public record UserFirstname(String value) {
    public UserFirstname {
        Assert.field(value, value).maxLength(255);
    }
}
