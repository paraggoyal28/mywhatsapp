package parag.codecake.whatsappclone.messaging.domain.message.aggregate;

import parag.codecake.whatsappclone.messaging.domain.message.vo.ConversationPublicId;
import parag.codecake.whatsappclone.messaging.domain.message.vo.MessageContent;

public record MessageSendNew(MessageContent messageContent,
                             ConversationPublicId conversationPublicId) {
}
