package com.xpf.dagger.di;

import android.util.Log;

import javax.inject.Inject;

/**
 * Created by x-sir on 2019/4/28 :)
 * Function:自定义英雄实体，并在构造依赖注入 @Inject 注解
 */
public class Hero {

    private static final String TAG = "Hero";
    private Clothes clothes;
    private Pants pants;

    /**
     * 将依赖对象通过构造方传入，这就是'依赖注入'了，hero 依赖了 clothes 和 pants，同样的，set 方法也可以进行依赖注入。
     * 大家是不是在不知不觉中也使用过类似的方式呢：
     * 对比一下两种方式，前者的缺点如下：
     * clothes 和 pants 无法重用，降低了代码的重用性
     * 增加了代码的耦合性，一旦 clothes 和 pants 更改可能需要修改 hero 类很多地方
     * 很难进行单元测试
     *
     * @param clothes
     * @param pants
     */
    @Inject
    public Hero(Clothes clothes, Pants pants) {
        this.clothes = clothes;
        this.pants = pants;
    }

    void printDefense() {
        Log.i(TAG, "您的角色拥有防御值为，衣服：" + clothes.defense + "，裤子：" + pants.defense);
    }
}
