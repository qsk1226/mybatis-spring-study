package com.goddess.knowledge.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * TODO
 *
 * @author qinshengke
 * @since 2020/5/24 17:13
 **/
public final class ParticleLock {
	private static final Map<String, Lock> LOCK_MAP = new ConcurrentHashMap<>();

	private void releaseLock(String lockKey) {
		ReentrantLock oldLock = (ReentrantLock) LOCK_MAP.get(lockKey);
		if (oldLock != null && oldLock.isHeldByCurrentThread()) {
			oldLock.unlock();
		}
	}

	private void doLock(String lockKey) {
		Lock newLock = new ReentrantLock();
		//尝试把新锁放入map，如果map中已存在key，返回老锁，如果不存在则存入map成功，并返回null值； 
		Lock oldLock = LOCK_MAP.putIfAbsent(lockKey, newLock);
		if (oldLock == null) {
			newLock.lock();
		} else {
			oldLock.lock();
		}
	}


}
