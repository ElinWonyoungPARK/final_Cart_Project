package org.WonyoungPark.api.user.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import static org.WonyoungPark.api.user.domain.QUserVO.userVO;

import org.WonyoungPark.api.user.domain.UserVO;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl extends QuerydslRepositorySupport implements UserCustomRepository{
	private final JPAQueryFactory qf;
	public UserRepositoryImpl(JPAQueryFactory qf) {
		super(UserVO.class);
		this.qf = qf;
	}
	@Override
	public String findId(long id){
		return qf.select(userVO.username).from(userVO)
				.where(userVO.userNum.eq(id)).fetchOne();
	}
	@Override
	public UserVO checkId(String id) {
		return qf.selectFrom(userVO)
				.where(userVO.username.eq(id))
				.fetchOne();
	}
	@Override
	public UserVO checkEmail(String email) {
		return qf.selectFrom(userVO)
				.where(userVO.email.eq(email))
				.fetchOne();
	}
}
