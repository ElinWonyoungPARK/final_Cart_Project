package org.WonyoungPark.api.wishilist.service;


import lombok.RequiredArgsConstructor;
import org.WonyoungPark.api.exhibition.domain.Exhbn;
import org.WonyoungPark.api.exhibition.service.ExhbnServiceImpl;
import org.WonyoungPark.api.user.service.UserServiceImpl;
import org.WonyoungPark.api.wishilist.domain.WishDTO;
import org.WonyoungPark.api.wishilist.domain.Wishlist;
import org.WonyoungPark.api.wishilist.domain.WishlistDTO;
import org.WonyoungPark.api.wishilist.repository.WishlistRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service @RequiredArgsConstructor
public class WishlistServiceImpl implements WishlistService {
	private final WishlistRepository repo;
	final UserServiceImpl userService;
	final ExhbnServiceImpl exhbnService;

	@Override public long delete(long userNum, long exhbnNum) { repo.deleteWish(userNum, exhbnNum); return 1;}
	@Override public List<Wishlist> findAll() { return repo.findAll();}
	@Override public Wishlist getOne(long id) { return repo.getOne(id);}
	@Override public long add(WishlistDTO w) { return (repo.save(w.toEntity()) != null) ?  1 : 0;}
	@Override public List<WishDTO> findWishlist() { return repo.findWishlist();}
	@Override public List<Exhbn> findByUser(long id){
		return repo.findByUser(id);
	}
}