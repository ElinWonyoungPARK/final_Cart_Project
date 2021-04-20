package org.WonyoungPark.api.wishilist.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.WonyoungPark.api.exhibition.domain.Exhbn;
import org.WonyoungPark.api.user.domain.UserVO;

@Data
@NoArgsConstructor
public class WishDTO {
    private long wishNum;
    private long exhbnNum;
    private long userNum;
    private Exhbn exhbn;
    private UserVO user;

}
