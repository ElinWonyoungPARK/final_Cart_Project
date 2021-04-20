package org.WonyoungPark.api.exhibition.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QExhbn is a Querydsl query type for Exhbn
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QExhbn extends EntityPathBase<Exhbn> {

    private static final long serialVersionUID = -1985458038L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QExhbn exhbn = new QExhbn("exhbn");

    public final ListPath<org.WonyoungPark.api.analysis.domain.Analysis, org.WonyoungPark.api.analysis.domain.QAnalysis> analysisList = this.<org.WonyoungPark.api.analysis.domain.Analysis, org.WonyoungPark.api.analysis.domain.QAnalysis>createList("analysisList", org.WonyoungPark.api.analysis.domain.Analysis.class, org.WonyoungPark.api.analysis.domain.QAnalysis.class, PathInits.DIRECT2);

    public final ListPath<org.WonyoungPark.api.booking.domain.Booking, org.WonyoungPark.api.booking.domain.QBooking> bookingList = this.<org.WonyoungPark.api.booking.domain.Booking, org.WonyoungPark.api.booking.domain.QBooking>createList("bookingList", org.WonyoungPark.api.booking.domain.Booking.class, org.WonyoungPark.api.booking.domain.QBooking.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> endDate = createDateTime("endDate", java.util.Date.class);

    public final StringPath exhbnArtist = createString("exhbnArtist");

    public final StringPath exhbnContent = createString("exhbnContent");

    public final StringPath exhbnGenre = createString("exhbnGenre");

    public final StringPath exhbnImage = createString("exhbnImage");

    public final NumberPath<Long> exhbnNum = createNumber("exhbnNum", Long.class);

    public final StringPath exhbnPrice = createString("exhbnPrice");

    public final StringPath exhbnTitle = createString("exhbnTitle");

    public final org.WonyoungPark.api.hall.domain.QHall hall;

    public final ListPath<org.WonyoungPark.api.review.domain.Review, org.WonyoungPark.api.review.domain.QReview> reviewList = this.<org.WonyoungPark.api.review.domain.Review, org.WonyoungPark.api.review.domain.QReview>createList("reviewList", org.WonyoungPark.api.review.domain.Review.class, org.WonyoungPark.api.review.domain.QReview.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> startDate = createDateTime("startDate", java.util.Date.class);

    public final NumberPath<Float> totalScore = createNumber("totalScore", Float.class);

    public final ListPath<org.WonyoungPark.api.wishilist.domain.Wishlist, org.WonyoungPark.api.wishilist.domain.QWishlist> wishLists = this.<org.WonyoungPark.api.wishilist.domain.Wishlist, org.WonyoungPark.api.wishilist.domain.QWishlist>createList("wishLists", org.WonyoungPark.api.wishilist.domain.Wishlist.class, org.WonyoungPark.api.wishilist.domain.QWishlist.class, PathInits.DIRECT2);

    public QExhbn(String variable) {
        this(Exhbn.class, forVariable(variable), INITS);
    }

    public QExhbn(Path<? extends Exhbn> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QExhbn(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QExhbn(PathMetadata metadata, PathInits inits) {
        this(Exhbn.class, metadata, inits);
    }

    public QExhbn(Class<? extends Exhbn> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hall = inits.isInitialized("hall") ? new org.WonyoungPark.api.hall.domain.QHall(forProperty("hall")) : null;
    }

}

