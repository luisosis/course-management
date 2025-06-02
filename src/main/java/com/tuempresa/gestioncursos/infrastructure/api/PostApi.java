package com.tuempresa.gestioncursos.infrastructure.api;

import com.tuempresa.gestioncursos.infrastructure.api.model.Post;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public interface PostApi {

    Observable<Post> getPosts();
}
