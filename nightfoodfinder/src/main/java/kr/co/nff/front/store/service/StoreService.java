package kr.co.nff.front.store.service;

import java.util.List;

import kr.co.nff.repository.vo.Store;

public interface StoreService {
	List<Store> listStore();
	Store detailStore(int no);
	void deleteStore(int no);
}
