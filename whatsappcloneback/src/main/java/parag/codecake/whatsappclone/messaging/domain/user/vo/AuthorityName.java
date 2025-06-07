package parag.codecake.whatsappclone.messaging.domain.user.vo;

import parag.codecake.whatsappclone.shared.error.domain.Assert;

public record AuthorityName(String name) {
    public AuthorityName {
        Assert.field("name", name).notNull();
    }
}
