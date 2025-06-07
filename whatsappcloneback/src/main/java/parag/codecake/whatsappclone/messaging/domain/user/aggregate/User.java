package parag.codecake.whatsappclone.messaging.domain.user.aggregate;

import org.jilt.Builder;
import parag.codecake.whatsappclone.messaging.domain.user.vo.*;

import java.time.Instant;

@Builder
public class User {
    private UserLastname lastname;

    private UserFirstname firstname;

    private UserEmail email;

    private UserPublicId userPublicId;

    private UserImageUrl imageUrl;

}
