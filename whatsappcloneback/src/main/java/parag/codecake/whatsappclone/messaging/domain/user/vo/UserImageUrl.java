package parag.codecake.whatsappclone.messaging.domain.user.vo;

import parag.codecake.whatsappclone.shared.error.domain.Assert;

public record UserImageUrl(String value) {
    public UserImageUrl {
        Assert.field(value, value).maxLength(255);
    }
}
