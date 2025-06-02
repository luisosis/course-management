package com.tuempresa.gestioncursos.infrastructure.api;

import com.tuempresa.gestioncursos.infrastructure.api.model.Post;
import io.reactivex.rxjava3.core.Observable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.adapter.rxjava.RxJava3Adapter;


@Service
public class PostApiImpl implements PostApi {

    @Autowired
    private WebClient.Builder webClientBuilder;

    @Override
    public Observable<Post> getPosts() {
        return RxJava3Adapter.fluxToObservable(webClientBuilder.build()
                .get()
                .uri("https://jsonplaceholder.typicode.com/posts?_limit=2")
                .retrieve()
                .bodyToFlux(Post.class));
    }
}
