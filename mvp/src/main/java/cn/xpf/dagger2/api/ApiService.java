package cn.xpf.dagger2.api;

import cn.xpf.dagger2.bean.MovieRespBean;
import io.reactivex.Observable;
import retrofit2.http.POST;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:
 */
public interface ApiService {

    /**
     * 获取电影列表
     *
     * @return
     */
    @POST("/PageSubArea/TrailerList.api")
    Observable<MovieRespBean> getMovieList();
}
