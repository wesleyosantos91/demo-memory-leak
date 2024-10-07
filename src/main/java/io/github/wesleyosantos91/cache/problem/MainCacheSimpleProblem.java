package io.github.wesleyosantos91.cache.problem;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import io.github.wesleyosantos91.domain.Person;

public class MainCacheSimpleProblem {

    public static void main(String[] args) throws InterruptedException {
        Cache<String, Object> objectCache = CacheBuilder.newBuilder().build();

        for (int index = 0; index < 1_000_000; index++) {
            objectCache.put("person" + index, new Person("Name" + index, 20 + (index % 50), "email" + index + "@example.com"));

            if (index % 10_000 == 0) {
                Thread.sleep(300);
            }
        }
    }
}
