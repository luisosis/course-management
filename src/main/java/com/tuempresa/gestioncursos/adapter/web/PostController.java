package com.tuempresa.gestioncursos.adapter.web;

import com.tuempresa.gestioncursos.infrastructure.api.PostApi;
import com.tuempresa.gestioncursos.infrastructure.api.model.Post;
import io.reactivex.rxjava3.core.Observable;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostApi postApi;

    @GetMapping()
    public Observable<Post> getPosts() {
        return postApi.getPosts();
    }
}
