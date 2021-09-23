package fr.pantheonsorbonne.ufr27.miage.service;

import fr.pantheonsorbonne.ufr27.miage.Cached;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Cached
@ApplicationScoped
public class ServiceImplCached implements Service, Serializable {

    private static final long serialVersionUID = 183711835890848362L;
    Map<Long, Long> cache = new HashMap<>();

    @Inject
    @Dependent
    Service service;

    @Override
    public long compute(long limit) {
        if (!cache.containsKey(limit)) {

            long res = service.compute(limit);
            cache.put(limit, res);
        }

        return cache.get(limit);

    }

}
