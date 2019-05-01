package cn.xpf.dagger2.base.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by xpf on 2019/5/1 :)
 * Function:A scoping annotation to permit objects whose lifetime should
 * conform to the life of the activity to be memorized in the correct component.
 */
@Scope
@Retention(RUNTIME)
public @interface FragmentScope {

}
