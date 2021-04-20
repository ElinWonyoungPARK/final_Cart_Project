package org.WonyoungPark.api.user.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserVO is a Querydsl query type for UserVO
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserVO extends EntityPathBase<UserVO> {

    private static final long serialVersionUID = 1994823543L;

    public static final QUserVO userVO = new QUserVO("userVO");

    public final StringPath admin = createString("admin");

    public final ListPath<org.WonyoungPark.api.analysis.domain.Analysis, org.WonyoungPark.api.analysis.domain.QAnalysis> analysisList = this.<org.WonyoungPark.api.analysis.domain.Analysis, org.WonyoungPark.api.analysis.domain.QAnalysis>createList("analysisList", org.WonyoungPark.api.analysis.domain.Analysis.class, org.WonyoungPark.api.analysis.domain.QAnalysis.class, PathInits.DIRECT2);

    public final StringPath birthday = createString("birthday");

    public final ListPath<org.WonyoungPark.api.booking.domain.Booking, org.WonyoungPark.api.booking.domain.QBooking> bookingList = this.<org.WonyoungPark.api.booking.domain.Booking, org.WonyoungPark.api.booking.domain.QBooking>createList("bookingList", org.WonyoungPark.api.booking.domain.Booking.class, org.WonyoungPark.api.booking.domain.QBooking.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final StringPath gender = createString("gender");

    public final StringPath name = createString("name");

    public final StringPath password = createString("password");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath preferGenre = createString("preferGenre");

    public final ListPath<org.WonyoungPark.api.review.domain.Review, org.WonyoungPark.api.review.domain.QReview> reviewList = this.<org.WonyoungPark.api.review.domain.Review, org.WonyoungPark.api.review.domain.QReview>createList("reviewList", org.WonyoungPark.api.review.domain.Review.class, org.WonyoungPark.api.review.domain.QReview.class, PathInits.DIRECT2);

    public final ListPath<Role, EnumPath<Role>> roles = this.<Role, EnumPath<Role>>createList("roles", Role.class, EnumPath.class, PathInits.DIRECT2);

    public final StringPath userImage = createString("userImage");

    public final StringPath username = createString("username");

    public final NumberPath<Long> userNum = createNumber("userNum", Long.class);

    public final ListPath<org.WonyoungPark.api.wishilist.domain.Wishlist, org.WonyoungPark.api.wishilist.domain.QWishlist> wishLists = this.<org.WonyoungPark.api.wishilist.domain.Wishlist, org.WonyoungPark.api.wishilist.domain.QWishlist>createList("wishLists", org.WonyoungPark.api.wishilist.domain.Wishlist.class, org.WonyoungPark.api.wishilist.domain.QWishlist.class, PathInits.DIRECT2);

    public QUserVO(String variable) {
        super(UserVO.class, forVariable(variable));
    }

    public QUserVO(Path<? extends UserVO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserVO(PathMetadata metadata) {
        super(UserVO.class, metadata);
    }

}

