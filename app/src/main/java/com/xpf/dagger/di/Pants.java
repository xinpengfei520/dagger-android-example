package com.xpf.dagger.di;

import javax.inject.Inject;

/**
 * Created by x-sir on 2019/4/28 :)
 * Function:自定义裤子实体，并在构造依赖注入 @Inject 注解
 */

public class Pants {

    public int defense = 60;

    @Inject
    public Pants() {

    }
}
