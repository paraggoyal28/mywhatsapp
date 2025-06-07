package parag.codecake.whatsappclone.messaging.domain.user.vo;


import org.springframework.util.Assert;

import java.util.UUID;

public record UserPublicId(UUID value) {
    public UserPublicId {
        Assert.notNull(value, "value can't be null");
    }
}
