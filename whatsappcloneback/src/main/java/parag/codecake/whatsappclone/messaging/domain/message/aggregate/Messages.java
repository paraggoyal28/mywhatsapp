package parag.codecake.whatsappclone.messaging.domain.message.aggregate;

import parag.codecake.whatsappclone.shared.error.domain.Assert;

import java.util.List;

public record Messages(List<Message> messages) {
    public Messages {
        Assert.field("messages", messages).notNull().noNullElement();
    }
}
