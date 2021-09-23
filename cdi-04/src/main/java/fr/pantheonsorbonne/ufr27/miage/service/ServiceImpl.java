package fr.pantheonsorbonne.ufr27.miage.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import javax.enterprise.context.RequestScoped;


@RequestScoped
public class ServiceImpl implements Service {

    List<Long> ints = new ArrayList<>();
    List<Long> res = new ArrayList<>();

    @Override
    public long compute(long limit) {

        ints = LongStream.range(2L, Math.round(Math.pow(10.0, limit))).boxed().collect(Collectors.toList());
        while (!ints.isEmpty()) {
            Long first = ints.get(0);

            res.add(first);
            List<Long> intsTemps = ints.stream().filter((Long l) -> Long.remainderUnsigned(l, first) != 0L)
                    .collect(Collectors.toList());
            ints = intsTemps;
        }

        return res.get(res.size() - 1);

    }


}
