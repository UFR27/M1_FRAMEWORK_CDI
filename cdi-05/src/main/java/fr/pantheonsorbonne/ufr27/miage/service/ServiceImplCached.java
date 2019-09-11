package fr.pantheonsorbonne.ufr27.miage.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

import fr.pantheonsorbonne.ufr27.miage.qualifier.CachingCapable;


@CachingCapable
@ApplicationScoped
public class ServiceImplCached implements Service, Serializable{


	private static final long serialVersionUID = 183711835890848362L;
	Map<Long, Long> cache = new HashMap<>();

	@Override
	public long compute(long limit) {
		if (!cache.containsKey(limit)) {
			ServiceImpl delegate = new ServiceImpl();
			long res = delegate.compute(limit);
			cache.put(limit, res);
		}

		return cache.get(limit);

	}

}
